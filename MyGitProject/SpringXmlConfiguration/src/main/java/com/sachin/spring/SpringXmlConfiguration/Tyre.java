package com.sachin.spring.SpringXmlConfiguration;

public class Tyre {
	
	private String brand;
	private String madeOf;
	
	
	
	public Tyre(String brand , String madeOf) {
		super();
		this.brand = brand;
		this.madeOf = madeOf;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getMadeOf() {
		return madeOf;
	}

	public void setMadeOf(String madeOf) {
		this.madeOf = madeOf;
	}

	@Override
	public String toString() {
		return "Tyre [brand=" + brand + "]" + "[madeOf=" + madeOf + "]";
	}
	
}
