package com.student.Project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.Project.Entity.Category;
import com.student.Project.Service.CategoryService;


@RestController
@RequestMapping("api/category")

public class CategoryController {
	
	@Autowired
	CategoryService categoryService;
	
	@PostMapping(value = "/create", produces = "application/json")
	public void create(@RequestBody Category request) {
						
		categoryService.create(request);
	}


}
