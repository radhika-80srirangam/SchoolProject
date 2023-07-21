package com.student.Project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.Project.Entity.Category;
import com.student.Project.Repository.CategoryRepository;

@Service

public class CategoryService {
	
@Autowired
CategoryRepository categoryRepository;

public void create (Category request) {
	categoryRepository.save(request);
	}


}
