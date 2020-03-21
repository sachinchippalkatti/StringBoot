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
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

@Component
//@Order(2)
public class ApiRequestFilter implements Filter{
	
	@Value("${rate.limit.second.limit.createPixelGet}")
	private int MAX_REQUESTS_PER_MINUTE_API;
	
	private LoadingCache<String, Integer> requestCountsPerIpAddressSecondPerApi;

	public ApiRequestFilter(){
		super();
		requestCountsPerIpAddressSecondPerApi = CacheBuilder.newBuilder().
                expireAfterWrite(1, TimeUnit.SECONDS).build(new CacheLoader<String, Integer>() {
            public Integer load(String key) {
                return 0;
            }
        });
	}
	
	@Override
    public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("API request filter");
    }
	
	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		 HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
	        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
	        String clientIpAddress = getClientIP((HttpServletRequest) servletRequest);
	        System.out.println(httpServletRequest.getRequestURI());
	        if("GET".equals(httpServletRequest.getMethod())) {
	        	if(isMaximumRequestsPerSecondExceededPerAPI(clientIpAddress)){
	        		httpServletResponse.setStatus(HttpStatus.TOO_MANY_REQUESTS.value());
	        		httpServletResponse.getWriter().write("Too many requests");
	        		return;
	        	}
	        }
	        System.out.println("Done of API request filter");
	        filterChain.doFilter(servletRequest, servletResponse);
	        System.out.println("End of API request filter");
	}
	
	private boolean isMaximumRequestsPerSecondExceededPerAPI(String clientIpAddress){
        int requests = 0;
        try {
            requests = requestCountsPerIpAddressSecondPerApi.get(clientIpAddress);
            if(requests >= MAX_REQUESTS_PER_MINUTE_API){
            	requestCountsPerIpAddressSecondPerApi.put(clientIpAddress, requests);
                return true;
             }
        } catch (Exception e) {
            requests = 0;
        }
        requests++;
        requestCountsPerIpAddressSecondPerApi.put(clientIpAddress, requests);
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
