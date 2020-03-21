package com.example.sachin.RestServiceDemo.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
public class CustomProperties {

	private int studentNo;
	private String studentName;
	
	
	public int getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CustomProperties [studentNo=");
		builder.append(studentNo);
		builder.append(", studentName=");
		builder.append(studentName);
		builder.append("]");
		return builder.toString();
	}
	
	
}
