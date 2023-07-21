package com.student.Project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.Project.Entity.Country;
import com.student.Project.Service.CountryService;

import Enumuration.Status;


@RestController
@RequestMapping("api/country")
public class CountryController {

	@Autowired
	CountryService countryService;

	@PostMapping(value = "/create", produces = "application/json")
	public void create(@RequestBody Country request) {
		
		Country countryObj = new Country();
		countryObj.setId(request.getId());
		countryObj.setName(request.getName());
		countryObj.setShortName(request.getShortName());
		countryObj.setStatus(Status.ACTIVE);
		
		countryService.create(request);
	}
}





