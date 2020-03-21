package com.sachin.mysql.cache.ehcache_hibernate.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person implements Serializable{
	
	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Integer Id;
	@Column(name="first")
	String name;
	@Column(name="last")
	String last;
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	
	
}
