package com.student.Project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.Project.Entity.State;
import com.student.Project.Service.StateService;

@RestController
@RequestMapping("api/state")

public class StateController {
	
	@Autowired
	StateService stateService;
	
	@PostMapping(value = "/create", produces = "application/json")
	public void create(@RequestBody State request) {
		
//		State stateObj = new State();
//		stateObj.setState_id(request.getState_id());
//		stateObj.setName(request.getName());
//		stateObj.setShortName(request.getShortName());
	
		stateService.create(request);
	}

}
