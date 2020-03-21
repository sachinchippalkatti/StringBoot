package com.mysql.connection.serviceMysql.pojo;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="email")
public class Email {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="email_id")
	@JsonIgnore
	private Integer id;
	
	@Column(name="email")
	private String email;
	
	@ManyToOne
	//@JoinColumn(name="id")
	@JsonIgnore
	@NotFound(action=NotFoundAction.IGNORE )
	private Student student;
	
	public Email() {}
	public Email(Integer id, String email) {
		super();
		this.id = id;
		this.email = email;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
}
