package com.sachin.mysql.cache.ehcache_hibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
public class EhcacheHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(EhcacheHibernateApplication.class, args);
	}

}
