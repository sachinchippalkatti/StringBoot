package com.mysql.connection.serviceMysql.pojo;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="student_sprots")
public class Student_Sprots {
	
	@Id
	@Column(name="studentid")
	Integer studentId;
	
	@Column(name="sports")
	Integer sports;
	
	@ManyToOne
	@JoinColumn(name="studentid", foreignKey=@ForeignKey(name="studentid_for"), insertable= false ,updatable=false)
	Student student;
	
	@OneToMany
	@JoinColumn(name="sports", foreignKey=@ForeignKey(name="sportsid_for"), insertable= false ,updatable= false)
	Set<Sports> sport;
	
	public Student_Sprots() {}

	public Student_Sprots(Integer studentId, Integer sports) {
		super();
		this.studentId = studentId;
		this.sports = sports;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public Integer getSports() {
		return sports;
	}

	public void setSports(Integer sports) {
		this.sports = sports;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Set<Sports> getSport() {
		return sport;
	}

	public void setSport(Set<Sports> sport) {
		this.sport = sport;
	}
	
	

}
