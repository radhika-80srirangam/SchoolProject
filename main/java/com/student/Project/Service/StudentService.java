package com.student.Project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.Project.Entity.Student;
import com.student.Project.Repository.StudentRepository;

@Service
public class StudentService {
	
@Autowired
public StudentRepository studentRepository;

	public void save(Student request) {
		
		 studentRepository.save(request);
		
	}

	public Iterable<Student> get(){
		
		return studentRepository.findAll();
		
	}

	public Student update(Student request) {
		// TODO Auto-generated method stub
		return studentRepository.save(request);
	}

	public Iterable<Student> deleteById() {
		// TODO Auto-generated method stub
	return null;
	}

	}
		
