package com.mysql.connection.serviceMysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mysql.connection.serviceMysql.pojo.Student;
import com.mysql.connection.serviceMysql.pojo.StudentJoinDetails;
import com.mysql.connection.serviceMysql.service.StudentService;


@RestController
@RequestMapping("/v1")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping("/student/all")
	public Iterable<Student> getStudent(){
		return studentService.getAllStudent();
	}
	
	@PostMapping("/student/add")
	public List<Student> addStudent(@RequestBody final Student student){
		studentService.addStudent(student);
		return studentService.getAllStudent();
	}
	
	@PutMapping("/student/update")
	public Iterable<Student> updateStudent(@RequestBody final Student student){
		studentService.updateStudent(student);
		return studentService.getAllStudent();
	}
	
	@PutMapping("/student/update/{id}")
	public Iterable<Student> updateStudentById(@RequestBody final Student student, @PathVariable final Integer id){
		studentService.updateStudentById(student, id);
		return studentService.getAllStudent();
	}
	
	@DeleteMapping("/student/delete")
	public Iterable<Student> deleteStudent(@RequestBody final Student student){
		studentService.deleteStudent(student);
		return studentService.getAllStudent();
	}
	
	@GetMapping("/student/sports")
	public Iterable<Student> getStudentSports(){
		return studentService.getByQuery();
	}
	
	@GetMapping("/student/sports/join")
	public Iterable<StudentJoinDetails> getStudentJoinSports(){
		return studentService.getByQueryJoin();
	}
}
