package com.mysql.connection.serviceMysql.pojo;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="sports")
public class Sports {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	@JsonIgnore
	Integer id;
	
	@Column(name="name")
	String name;
	
	@ManyToMany(mappedBy="sportList")
	//@JoinColumn(name="id" , referencedColumnName="sports",insertable= false ,updatable=false)
	@JsonIgnore
	Collection<Student> student;
	
	public Sports() {}
	
	public Sports(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Collection<Student> getStudent() {
		return student;
	}

	public void setStudent(Collection<Student> student) {
		this.student = student;
	}

}
