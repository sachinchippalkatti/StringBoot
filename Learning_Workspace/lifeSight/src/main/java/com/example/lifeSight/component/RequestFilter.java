package com.example.lifeSight.component;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;
//import org.springframework.cglib.core.internal.LoadingCache;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

@Component
@Order(1)
public class RequestFilter implements Filter {
	
	@Value("${rate.limit.second.limit}")
    private int MAX_REQUESTS_PER_SECOND;
	
	@Value("${rate.limit.minute.limit}")
	private int MAX_REQUESTS_PER_MINUTE;

   // private Map<String, Integer> requestCountsPerIpAddress;
	
	private LoadingCache<String, Integer> requestCountsPerIpAddressSecond;
	
	private LoadingCache<String, Integer> requestCountsPerIpAddressMinute;

    public RequestFilter(){
        super();
        //requestCountsPerIpAddress = new HashMap<>();
        //requestCountsPerIpAddress.put("1", 30);
        requestCountsPerIpAddressSecond = CacheBuilder.newBuilder().
                expireAfterWrite(1, TimeUnit.SECONDS).build(new CacheLoader<String, Integer>() {
            public Integer load(String key) {
                return 0;
            }
        });
        
        requestCountsPerIpAddressMinute = CacheBuilder.newBuilder().
                expireAfterWrite(1, TimeUnit.MINUTES).build(new CacheLoader<String, Integer>() {
            public Integer load(String key) {
                return 0;
            }
        });
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    	System.out.println("Global filter");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
        String clientIpAddress = getClientIP((HttpServletRequest) servletRequest);
        System.out.println(httpServletRequest.getRequestURI());
        if("GET".equals(httpServletRequest.getMethod())) {
        	if(isMaximumRequestsPerSecondExceeded(clientIpAddress)){
        		httpServletResponse.setStatus(HttpStatus.TOO_MANY_REQUESTS.value());
        		httpServletResponse.getWriter().write("Too many requests");
        		return;
        	}
        }
        
        if("POST".equals(httpServletRequest.getMethod())) {
        	if(isMaximumRequestsPerMinuteExceeded(clientIpAddress)){
        		httpServletResponse.setStatus(HttpStatus.TOO_MANY_REQUESTS.value());
        		httpServletResponse.getWriter().write("Too many requests");
        		return;
        	}
        }
        System.out.println("Done of Global filter");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("End of Global filter");
    }

    private boolean isMaximumRequestsPerSecondExceeded(String clientIpAddress){
        int requests = 0;
        try {
            requests = requestCountsPerIpAddressSecond.get(clientIpAddress);
            if(requests >= MAX_REQUESTS_PER_SECOND){
            	requestCountsPerIpAddressSecond.put(clientIpAddress, requests);
                return true;
             }
        } catch (Exception e) {
            requests = 0;
        }
        requests++;
        requestCountsPerIpAddressSecond.put(clientIpAddress, requests);
        return false;
    }
    
    private boolean isMaximumRequestsPerMinuteExceeded(String clientIpAddress){
        int requests = 0;
        try {
            requests = requestCountsPerIpAddressMinute.get(clientIpAddress);
            if(requests >= MAX_REQUESTS_PER_MINUTE){
            	requestCountsPerIpAddressMinute.put(clientIpAddress, requests);
                return true;
             }
        } catch (Exception e) {
            requests = 0;
        }
        requests++;
        requestCountsPerIpAddressMinute.put(clientIpAddress, requests);
        return false;
    }

    
    public String getClientIP(HttpServletRequest request) {
        String xfHeader = request.getHeader("X-Forwarded-For");
        if (xfHeader == null){
            return request.getRemoteAddr();
        }
        return xfHeader.split(",")[0];
    }

    @Override
    public void destroy() {

    }
}
