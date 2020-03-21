package com.example.resttemplate.rest_template.controller;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.resttemplate.rest_template.pojo.User;
import com.example.resttemplate.rest_template.url.URLEntity;

@RestController
@RequestMapping("/template/user")
public class MongoDbController {

	@Autowired
	RestTemplate restTemplate;
	
	URLEntity urlEntity;
	
	@GetMapping("/all")
	public String getUser() {
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<String> requestEntity = new HttpEntity<>(headers);
		return restTemplate.exchange(urlEntity.MONGOTEMPLATE + "/user/all", HttpMethod.GET, requestEntity, String.class).getBody();
	}
	
	@GetMapping("/all/json")
	public User[] getUserJson() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> requestEntity = new HttpEntity<>(headers);
		return restTemplate.exchange(urlEntity.MONGOTEMPLATE + "/user/all", HttpMethod.GET, requestEntity, User[].class).getBody();
	}
	
	@PostMapping("/add")
	public String addUser(@RequestBody final User user) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<User> requestEntity = new HttpEntity<User>(user, headers);
		return restTemplate.exchange(urlEntity.MONGOTEMPLATE + "/user/add", HttpMethod.POST, requestEntity, String.class).getBody();
	}
	
	@PutMapping("/update")
	public String updateUser(@RequestBody final User user) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<User> requestEntity = new HttpEntity<User>(user, headers);
		return restTemplate.exchange(urlEntity.MONGOTEMPLATE + "/user/update", HttpMethod.PUT, requestEntity, String.class).getBody();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable final Integer id , @RequestBody User user) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<User> requestEntity = new HttpEntity<>(user,headers);
		return restTemplate.exchange(urlEntity.MONGOTEMPLATE + "/user/delete/"+id, HttpMethod.DELETE, requestEntity, String.class).getBody();
	}
}
