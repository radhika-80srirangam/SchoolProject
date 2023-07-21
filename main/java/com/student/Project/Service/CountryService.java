package com.student.Project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.student.Project.Entity.Country;
import com.student.Project.Repository.CountryRepository;

import lombok.NonNull;

@Service
@Transactional

public class CountryService {
	@Autowired
	private @NonNull CountryRepository countryRepository;

	public void create(Country request) {
		countryRepository.save(request);
	}
}
