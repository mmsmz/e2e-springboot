package com.arafath.student.dal;

import com.arafath.student.dal.entities.Student;
import com.arafath.student.dal.repos.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;


@SpringBootTest
class StudentdalApplicationTests {

//	@Test
//	void contextLoads() {
//	}
	@Autowired
	// we want spring to do dependency injection here where spring is gonna create
	// an instance of the particular StudentRepository interface extends and use it in the run time.
	private StudentRepository studentRepository;

	@Test
	public void testCreateStudent(){
		Student student = new Student();
		student.setName("John");
		student.setCourse("Java Web Services");
		student.setFee(30d);
		studentRepository.save(student);
	}

	@Test
	public void testFindStudentById(){
		Optional<Student> student = studentRepository.findById(1l);
		System.out.println(student);
	}

	@Test
	public void testUpdateStudent() {
		Optional<Student> student = studentRepository.findById(2l);
		student.get().setFee(50d);
		studentRepository.save(student.get());
	}

	@Test
	public void testDeleteStudent(){
//		Optional<Student> student = studentRepository.findById(2l);
//		student.get().getId();
//		studentRepository.delete(student.get());
		//or
//		Student student = new Student();
//		student.setId(1l);
//		studentRepository.deleteById(student.getId());
		//or
		studentRepository.deleteById(4l);
	}
}