package com.mysql.connection.serviceMysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.mysql.connection.serviceMysql.pojo.Student;
import com.mysql.connection.serviceMysql.pojo.StudentJoinDetails;

public interface StudentRepository extends CrudRepository<Student, Integer> , JpaRepository<Student, Integer>{
	
	@Query(value="select st.* from students st where st.id=1", nativeQuery = true)
	Iterable<Student> queryBy();
	
	
	@Query(value="select s.name as name , st.name as sport from students s\r\n" + 
			"left join student_sprots ss on s.id = ss.studentid\r\n" + 
			"left join sports st on ss.sports=st.id", nativeQuery = true)
	Iterable<StudentJoinDetails> queryByJoin();
	
	
}
