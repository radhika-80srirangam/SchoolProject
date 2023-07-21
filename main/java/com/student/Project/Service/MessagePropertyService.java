package com.student.Project.Service;

import java.util.Locale;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MessagePropertyService {
	
	@Autowired
    private MessageSource messageSource;
	
	public String getMessage(String key) {
		return messageSource.getMessage(key,null, Locale.ENGLISH);
	}
	
	public String getMessage(String key, String[] params) {
		return messageSource.getMessage(key,params, Locale.ENGLISH);
	}
	public String getMessage(String key, UUID[] params) {
		return messageSource.getMessage(key,params, Locale.ENGLISH);
	}

}
