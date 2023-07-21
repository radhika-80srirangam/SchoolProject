package com.student.Project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.Project.Entity.Religion;
import com.student.Project.Service.ReligionService;

@RestController
@RequestMapping("api/religion")

public class ReligionController {
	
@Autowired
ReligionService religionService;

@PostMapping(value = "/create", produces = "application/json")
public void create(@RequestBody Religion request) {

	Religion religionObj = new Religion();
	religionObj.setId(request.getId());
	religionObj.setName(request.getName());
				
	religionService.create(request);

}}
