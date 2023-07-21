package com.student.Project.Repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.student.Project.Entity.City;

public interface CityRepository extends CrudRepository <City, UUID >{

	 
}
