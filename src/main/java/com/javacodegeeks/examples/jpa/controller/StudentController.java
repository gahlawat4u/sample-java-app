package com.javacodegeeks.examples.jpa.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("students")
public class StudentController {

	@GetMapping
	public String getStudents() {
		return "Hello World! Welcome to demo java project for Automation of confirmation check.";
	}

	@GetMapping("{id}")
	public String getStudent(@PathVariable Long id) {
		return "student id: " + id;
	}

	@PostMapping
	public String addStudent() {
		return "Student Created";
	}

	@PutMapping("{id}")
	public String updateStudent(@PathVariable Long id) {
		return "Updated student: " + id;
	}

	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable Long id) {
		return "deleted id: " + id;
	}
}
