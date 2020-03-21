package com.example.lifeSight;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.lifeSight.component.ApiRequestFilter;

@Configuration
public class ApiFilterConfig {

	@Bean
	public FilterRegistrationBean<ApiRequestFilter> apiFilterBean(){
		FilterRegistrationBean<ApiRequestFilter> apiFilter = new FilterRegistrationBean<>();
		apiFilter.setFilter(new ApiRequestFilter());
		apiFilter.addUrlPatterns("/createPixel/*");
		return apiFilter;
	}
}
