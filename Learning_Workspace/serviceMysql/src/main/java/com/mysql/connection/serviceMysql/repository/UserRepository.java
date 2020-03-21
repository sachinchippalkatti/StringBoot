package com.mysql.connection.serviceMysql.repository;

import org.springframework.data.repository.CrudRepository;

import com.mysql.connection.serviceMysql.pojo.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
