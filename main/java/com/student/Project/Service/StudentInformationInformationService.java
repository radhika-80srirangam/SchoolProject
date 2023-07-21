package com.student.Project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.Project.Entity.StudentAddressInformation;
import com.student.Project.Repository.StudentInformationRepository;

@Service
public class StudentInformationInformationService {
	
	@Autowired
	public static StudentInformationRepository studentInformationRepository;
	
	public static void save(StudentAddressInformation request) {
		
		studentInformationRepository.save(request);
		
	}

}
