package com.student.Project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.Project.Entity.Occupation;
import com.student.Project.Service.OccupationService;

@RestController
@RequestMapping("api/occupation")

public class OccupationController {
	
@Autowired

OccupationService occupationservice;

@PostMapping (value = "/create", produces = "application/json")
public void create(@RequestBody Occupation request) {
	
	Occupation occupationObj = new Occupation();
	occupationObj.setId(request.getId());
	occupationObj.setName(request.getName());
				
	occupationservice.create(request);
}



}
