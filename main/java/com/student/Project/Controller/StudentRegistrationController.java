 package com.student.Project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.Project.Entity.Student;
import com.student.Project.Service.StudentService;



@RestController
@RequestMapping("/api/student/registration")
//@Api(value = "StudentRegistration: studentRegistration Rest API", produces = "application/json", consumes = "application/json")

public class StudentRegistrationController {
	
	@Autowired 
	public StudentService studentService;
	
	@PostMapping("/create")
	public void save(@RequestBody Student requestdto) {
			 studentService.save(requestdto);
	}

	@GetMapping(value = "/get")	
	public Iterable <Student> get(){
	return studentService.get();
	}
	
	@PutMapping(value = "/update")
	public Student studentsUp (@RequestBody Student requestdto){
		studentService.save(requestdto);
		return requestdto;
	
	}
	
	@DeleteMapping(value = "/delete")
	public Iterable <Student> deleteById(){
	return studentService.deleteById();
	
	}
	
		
	
	}



