package com.mysql.connection.serviceMysql.pojo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("bike")
public class TwoWheeler extends Vehical {
	private String type;
	public TwoWheeler() {}
	public TwoWheeler(String type) {
		super();
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
