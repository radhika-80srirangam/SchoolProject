package com.student.Project.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.Project.Entity.Caste;
import com.student.Project.Repository.CasteRepository;

@Service
@Transactional
public class CasteService {

	@Autowired
	private CasteRepository casteRepository;
	public void create (Caste request) {
	casteRepository.save(request);
	}
}
