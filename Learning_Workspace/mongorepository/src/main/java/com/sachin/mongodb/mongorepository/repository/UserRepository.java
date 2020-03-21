package com.sachin.mongodb.mongorepository.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sachin.mongodb.mongorepository.document.User;

@Repository
public interface UserRepository extends MongoRepository<User, Integer>{

}
