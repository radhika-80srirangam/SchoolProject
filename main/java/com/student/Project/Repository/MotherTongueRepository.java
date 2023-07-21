package com.student.Project.Repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.student.Project.Entity.MotherTongue;

public interface MotherTongueRepository extends CrudRepository <MotherTongue, UUID >{

}
