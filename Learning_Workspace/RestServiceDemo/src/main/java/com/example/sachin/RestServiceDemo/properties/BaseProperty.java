package com.example.sachin.RestServiceDemo.properties;

import java.util.ArrayList;
import java.util.List;

public class BaseProperty {

	public List<Property> property = new ArrayList<>();

	public List<Property> getProperty() {
		return property;
	}

	public void setProperty(List<Property> property) {
		this.property = property;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BaseProperty [property=");
		builder.append(property);
		builder.append("]");
		return builder.toString();
	}

	
}
