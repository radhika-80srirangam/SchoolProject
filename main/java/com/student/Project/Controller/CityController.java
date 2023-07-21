package com.student.Project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.Project.Entity.City;
import com.student.Project.Service.CityService;

@RestController
@RequestMapping("api/city")

public class CityController {
@Autowired
CityService cityService;

@PostMapping(value = "/create", produces = "application/json")
public void create(@RequestBody City request) {
	
	City cityObj = new City();
	cityObj.setId(request.getId());
	cityObj.setName(request.getName());
	cityObj.setShortName(request.getShortName());
			
	cityService.create(request);

}}
