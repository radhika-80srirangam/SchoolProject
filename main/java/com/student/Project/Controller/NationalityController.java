package com.student.Project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.Project.Entity.Nationality;
import com.student.Project.Service.NationalityService;

@RestController
@RequestMapping("api/nationality")

public class NationalityController {
	
@Autowired

NationalityService nationalityService;

@PostMapping(value = "/create", produces = "application/json")
public void create(@RequestBody Nationality request) {
	
//	Nationality nationalityObj = new Nationality();
//	nationalityObj.setId(request.getId());
//	nationalityObj.setName(request.getName());
//	nationalityObj.setShortName(request.getShortName());
				
	nationalityService.create(request);

}}
