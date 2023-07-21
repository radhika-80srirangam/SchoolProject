package com.student.Project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.Project.Entity.Nationality;
import com.student.Project.Repository.NationalityRepository;

@Service
public class NationalityService {
@Autowired
	private NationalityRepository nationalityRepository;

	public void create (Nationality request) {
		nationalityRepository.save(request);
		
	}

}
