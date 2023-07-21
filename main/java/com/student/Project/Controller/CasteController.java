package com.student.Project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.Project.Entity.Caste;
import com.student.Project.Service.CasteService;

@RestController
@RequestMapping("api/caste")
public class CasteController {
	
@Autowired
CasteService casteService;

@PostMapping (value = "/create", produces = "application/json")
public void create(@RequestBody Caste request) {
	
	Caste casteObj = new Caste();
	casteObj.setId(request.getId());
	casteObj.setName(request.getName());
				
	casteService.create(request);
}



}
