package com.student.Project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.Project.Entity.Religion;
import com.student.Project.Repository.ReligionRepository;

@Service
public class ReligionService {
	
@Autowired 

private ReligionRepository religionRepository;

public void create (Religion request) {
	religionRepository.save(request);
	

}}
