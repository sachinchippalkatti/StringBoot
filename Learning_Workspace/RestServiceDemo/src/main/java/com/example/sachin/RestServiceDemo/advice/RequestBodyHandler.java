package com.example.sachin.RestServiceDemo.advice;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Arrays;

import org.springframework.core.MethodParameter;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.method.annotation.RequestBodyAdvice;

public class RequestBodyHandler  implements RequestBodyAdvice{

	@Override
	public boolean supports(MethodParameter methodParameter, Type targetType,
			Class<? extends HttpMessageConverter<?>> converterType) {
		// TODO Auto-generated method stub
		boolean value = Arrays.asList(methodParameter.getMethodAnnotations()).stream().anyMatch(t->t.annotationType().equals(GetMapping.class));
		System.out.println("support");
		return value;
	}

	@Override
	public HttpInputMessage beforeBodyRead(HttpInputMessage inputMessage, MethodParameter parameter, Type targetType,
			Class<? extends HttpMessageConverter<?>> converterType) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object afterBodyRead(Object body, HttpInputMessage inputMessage, MethodParameter parameter, Type targetType,
			Class<? extends HttpMessageConverter<?>> converterType) {
		// TODO Auto-generated method stub
		System.out.println("afterBodyRead");
		return null;
	}

	@Override
	public Object handleEmptyBody(Object body, HttpInputMessage inputMessage, MethodParameter parameter,
			Type targetType, Class<? extends HttpMessageConverter<?>> converterType) {
		// TODO Auto-generated method stub
		return null;
	}

}
