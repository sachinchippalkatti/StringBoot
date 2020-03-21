package com.mysql.connection.serviceMysql.pojo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("Car")
public class FourWheeler extends Vehical {
	private String steringType;
	public FourWheeler() {}
	public FourWheeler(String steringType) {
		super();
		this.steringType = steringType;
	}

	public String getSteringType() {
		return steringType;
	}

	public void setSteringType(String steringType) {
		this.steringType = steringType;
	}
	
}
