package com.mysql.connection.serviceMysql.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="phone")
public class Phone {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	@JsonIgnore
	private Integer id;
	
	@Column(name="num")
	private String number;
	
	public Phone() {
		
	}
	public Phone(Integer id, String number) {
		super();
		this.id = id;
		this.number = number;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getnumber() {
		return number;
	}
	public void setNum(String number) {
		this.number = number;
	}
	
	
}
