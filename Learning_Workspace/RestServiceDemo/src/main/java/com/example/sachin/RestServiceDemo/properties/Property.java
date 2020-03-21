package com.example.sachin.RestServiceDemo.properties;

public class Property {

	private int noOfStudent;
	private String schoolName;
	
	public int getNoOfStudent() {
		return noOfStudent;
	}
	public void setNoOfStudent(int noOfStudent) {
		this.noOfStudent = noOfStudent;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Property [noOfStudent=");
		builder.append(noOfStudent);
		builder.append(", schoolName=");
		builder.append(schoolName);
		builder.append("]");
		return builder.toString();
	}
	
	
}
