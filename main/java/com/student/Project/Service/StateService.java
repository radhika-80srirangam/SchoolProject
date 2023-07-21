package com.student.Project.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.Project.Entity.State;
import com.student.Project.Repository.StateRepository;

import lombok.NonNull;

@Service
@Transactional

public class StateService {
	
	@Autowired
	private @NonNull StateRepository stateRepository;
	public void create (State request) {
	stateRepository.save(request);
	}
}
