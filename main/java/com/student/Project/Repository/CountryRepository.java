package com.student.Project.Repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.student.Project.Entity.Country;

public interface CountryRepository extends CrudRepository <Country, UUID > {


}
 