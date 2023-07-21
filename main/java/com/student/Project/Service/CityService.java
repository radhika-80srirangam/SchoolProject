package com.student.Project.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.Project.Entity.City;
import com.student.Project.Repository.CityRepository;

import lombok.NonNull;

@Service
@Transactional
public class CityService {
	
	@Autowired
	private @NonNull CityRepository cityRepository;
	
	public void create (City request) {
	cityRepository.save(request);
	

}}
