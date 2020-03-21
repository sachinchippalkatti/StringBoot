package com.sachin.mysql.cache.ehcache_hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sachin.mysql.cache.ehcache_hibernate.pojo.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

	Person findByName(String name);

}
