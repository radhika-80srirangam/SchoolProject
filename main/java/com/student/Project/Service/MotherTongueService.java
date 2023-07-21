package com.student.Project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.Project.Entity.MotherTongue;
import com.student.Project.Repository.MotherTongueRepository;

import lombok.NonNull;

@Service

public class MotherTongueService {
	
@Autowired

private @NonNull MotherTongueRepository motherTongueRepository;

public void create (MotherTongue request) {
	motherTongueRepository.save(request);
	
}}
