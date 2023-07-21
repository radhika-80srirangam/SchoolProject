package com.student.Project.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.Project.Entity.Occupation;
import com.student.Project.Repository.OccupationRepository;

@Service
@Transactional
public class OccupationService {
	
	@Autowired
	private OccupationRepository occupationRepository;
	public void create (Occupation request) {
	occupationRepository.save(request);
	}

}
