package com.mysql.connection.serviceMysql.pojo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


@Entity
@Table(name="students")
//@Cacheable
//@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Student {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	@Column(name="name")
	String name;
	
	@Column(name="address")
	String address;
	
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="pid")
	//@JoinColumn(name="id", referencedColumnName="id")
	Phone phone;
	
	@OneToMany(cascade = {CascadeType.ALL})
	//@OneToMany(cascade = {CascadeType.ALL},mappedBy="student")
	@JoinTable(name="STUDENT_MAIL",joinColumns=@JoinColumn(name="STUDENT_ID"),
				inverseJoinColumns=@JoinColumn(name="MAIL_ID"))
	Collection<Email> email = new ArrayList<>();
	
	@ManyToMany(cascade= {CascadeType.ALL})
	//@JoinColumn(name="id", referencedColumnName="id", insertable= false , updatable=false)
	Collection<Sports> sportList = new ArrayList<>();
	
	@OneToOne(cascade= {CascadeType.ALL})
	private Vehical vehical;
	
	public Student(){
		
	}

	public Student(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public Collection<Email> getEmail() {
		return email;
	}

	public void setEmail(Collection<Email> email) {
		this.email = email;
	}

	public Collection<Sports> getSportList() {
		return sportList;
	}

	public void setSportList(Collection<Sports> sportList) {
		this.sportList = sportList;
	}

	public Vehical getVehical() {
		return vehical;
	}

	public void setVehical(Vehical vehical) {
		this.vehical = vehical;
	}
	
}
