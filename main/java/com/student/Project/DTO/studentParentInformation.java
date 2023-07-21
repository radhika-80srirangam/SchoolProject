package com.student.Project.DTO;

import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class studentParentInformation {
	
	private UUID id;
	private String firstName;
	private String lastName;
	private String emailId;
	//@Size(min=0,max=10)
	private String mobileNumber;
	private String designation;
	private UUID occupationId;
	private String occupationName;
	private String organizationName;
	private String annualIncome;
	private String parentDetailsType;
	//Parent User Account created
	private String userName;
	private String password;
	
}
