package com.mysql.connection.serviceMysql.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysql.connection.serviceMysql.pojo.Student;
import com.mysql.connection.serviceMysql.pojo.StudentJoinDetails;
import com.mysql.connection.serviceMysql.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		List<Student> ls = new ArrayList<>();
		studentRepository.findAll()
						 .forEach(ls::add);
		return ls;
	}

	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		studentRepository.save(student);
	}

	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		studentRepository.save(student);
	}

	public void updateStudentById(Student student, Integer id) {
		// TODO Auto-generated method stub
		Student stu = studentRepository.findById(id).get();
		System.out.println("Student Name :" + stu.getName() + "Student Address :" + stu.getAddress());
		Student newStudent = new Student(id, student.getName(),student.getAddress());
		studentRepository.save(newStudent);
	}

	public void deleteStudent(Student student) {
		// TODO Auto-generated method stub
		studentRepository.delete(student);
	}

	public Iterable<Student> getByQuery() {
		// TODO Auto-generated method stub
		return studentRepository.queryBy();
	}

	public Iterable<StudentJoinDetails> getByQueryJoin() {
		// TODO Auto-generated method stub
		return studentRepository.queryByJoin();
	}
	
}
