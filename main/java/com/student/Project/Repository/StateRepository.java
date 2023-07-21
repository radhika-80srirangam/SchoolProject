package com.student.Project.Repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.student.Project.Entity.State;

public interface StateRepository extends CrudRepository <State, UUID >{
	
}
