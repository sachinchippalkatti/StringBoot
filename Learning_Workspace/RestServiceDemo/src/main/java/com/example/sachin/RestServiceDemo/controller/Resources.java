package com.example.sachin.RestServiceDemo.controller;

import java.util.Arrays;
import java.util.stream.Collectors;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.PathParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.sachin.RestServiceDemo.pojo.Person;

@RestController
@RequestMapping("/profile")
public class Resources {
	
	@Value("${name.lable:chippalkatti}")
	String value;

	private static final Logger LOGGER = LoggerFactory.getLogger(Resources.class);
/*	@GetMapping("{name}")
	public String sendHelloPathVariable(@PathVariable String name) {
		return "Hello World GET sendHelloPathVariable " + name;
	}*/
	
	@GetMapping
	public String sendHelloQueryParam(@RequestParam String name) {
		LOGGER.error("ERROR");
		LOGGER.warn("WARN");
		LOGGER.debug("DEBUG");
		return "Hello World GET sendHelloQueryParam  first" + name + value;
	}
	
	@GetMapping("/matrix/sachin")
	public String sendHelloMatrixParam(@MatrixVariable("name") String name,
										@MatrixVariable("last") String last) {
		return "Hello World GET sendHelloMatrixParam " + name + last;
	}
	
	@PostMapping
	public String sendHelloPost(@RequestBody Person person) {
		return "Hello World POST " + person.getName();
	}
	
	@GetMapping("/header")
	public String sendHelloHeaderParam(@RequestHeader String customeHeaderValue) {
		return "Hello World GET sendHelloHeaderParam " + customeHeaderValue;
	}
	
	@GetMapping("/cookies")
	public String sendHelloCookiesParam(@CookieValue(name="sessionid") String sessionid) {
		return "Hello World GET sendHelloCookiesParam " + sessionid;
	}
	
	@GetMapping("/context")
	public String sendHelloContextParam(HttpServletRequest request,HttpServletResponse responce){
		Cookie[] cookies = request.getCookies();
	    if (cookies != null) {
	        return Arrays.stream(cookies)
	                .map(c -> c.getName() + "=" + c.getValue())
	                .collect(Collectors.joining(", "));
	    }
	    return "empty" + request.getRequestURI() + request.getRequestURL();
	}
	
	@GetMapping("/resource/{parentName}/sub")
	public SubResource getSubResource(@PathParam("parentName") String parentName) {
		return new SubResource();
	}
}
