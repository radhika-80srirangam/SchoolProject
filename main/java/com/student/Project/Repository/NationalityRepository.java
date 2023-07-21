package com.student.Project.Repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.student.Project.Entity.Nationality;
@Repository
public interface NationalityRepository extends CrudRepository <Nationality, UUID> {

}
