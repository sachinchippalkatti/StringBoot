package com.sachin.mongodb.mongorepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories
@SpringBootApplication
public class MongorepositoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongorepositoryApplication.class, args);
	}

}
