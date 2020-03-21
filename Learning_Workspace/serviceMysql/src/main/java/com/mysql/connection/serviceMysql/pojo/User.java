package com.mysql.connection.serviceMysql.pojo;

import java.util.Collection;
import java.util.Date;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer Id;
	
	@Column(name="first_name",nullable = false)
	private String name;
	
	@Column(name="last_name")
	private String last;
	
	@Column(name="date")
	@Temporal(TemporalType.DATE)
	private Date date;
	
	@Column(name="description")
	@Lob //large object
	private String des;
	
	@Transient
	private String des1;
	
	@Embedded
	private Address address;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="street", column=@Column(name="office_street")),
		@AttributeOverride(name="city", column=@Column(name="office_city")),
		@AttributeOverride(name="state", column=@Column(name="office_state"))
	})
	private Address officeAddress;
	
	/*@ElementCollection
	private Set<Address> addressHistory;*/
	
	@ElementCollection(fetch=FetchType.LAZY)
	//@GenericGenerator(name="hilo-gen",strategy="hilo") // not working-- compile time error
	//@GenericGenerator(name="sequence-gen",strategy="sequence") // not working -- runtime error
	@GenericGenerator(name="increment-gen",strategy="increment")
	@JoinTable(name="addressHistory", joinColumns=@JoinColumn(name="user_ids"))
	@CollectionId(columns= {@Column(name="add_id")},generator="increment-gen", type=@Type(type="long"))
	private Collection<Address> addressHistory;
	
	public User() {}
	
	public User(Integer id, String name, String last, Date date) {
		super();
		Id = id;
		this.name = name;
		this.last = last;
		this.date = date;
	}
	
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}

	public String getDes1() {
		return des1;
	}

	public void setDes1(String des1) {
		this.des1 = des1;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Address getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}

	public Collection<Address> getAddressHistory() {
		return addressHistory;
	}

	public void setAddressHistory(Collection<Address> addressHistory) {
		this.addressHistory = addressHistory;
	}
	
	
}
