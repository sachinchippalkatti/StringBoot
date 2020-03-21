package com.sachin.kafka.KafkaExample.controller;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.apache.kafka.clients.producer.RecordMetadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sachin.kafka.KafkaExample.pojo.User;

@RestController
@RequestMapping("/kafka")
public class UserController {
	
	@Autowired
	KafkaTemplate<String, User> kafka;
	
	private static final String TOPICNAME = "kafka_consumer1";
	
	/*@RequestMapping("/hello/{message}")
	public String printUser(@PathVariable("message") String message) {
		
		kafka.send(TOPICNAME, message);
		return "Hello " + message;
	}*/
	
	@RequestMapping(method = RequestMethod.POST , value="/publishUser")
	public User getUser(@RequestBody User user) {
		//send and forget
		ListenableFuture future = kafka.send(TOPICNAME,user);
		try {
			//Synchronous Send- send record 
			SendResult<String, User> returndata =kafka.send(TOPICNAME,user).get();
			returndata.getRecordMetadata().offset();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(future);
		//kafka.send
		return user;
	}

}
