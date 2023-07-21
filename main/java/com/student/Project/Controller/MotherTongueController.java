package com.student.Project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.Project.Entity.MotherTongue;
import com.student.Project.Service.MotherTongueService;

@RestController
@RequestMapping("api/mothertongue")

public class MotherTongueController {
	
@Autowired

MotherTongueService motherTongueService;

@PostMapping(value = "/create", produces = "application/json")
public void create(@RequestBody MotherTongue request) {
	
	MotherTongue motherTongueObj = new MotherTongue();
	motherTongueObj.setId(request.getId());
	motherTongueObj.setName(request.getName());
				
	motherTongueService.create(request);


}


}
