package com.javacodegeeks.examples.jpa;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringRunner;

import com.javacodegeeks.examples.jpa.controller.StudentController;

@RunWith(SpringRunner.class)
public class SpringBootJpaApplicationTests {

	@InjectMocks
	private StudentController controller;
	
	@Test
	public void getStudentsTest() {		
		assertEquals("student id: 1", controller.getStudent(1l));		
	}
	
	@Test
	public void addStudentTest() {
		assertEquals("Student Created", controller.addStudent());
	}
	
	@Test
	public void deleteStudentTest() {
		assertEquals("deleted id: 1", controller.deleteStudent(1l));
	}

}
