package com.student.Project.DTO;

import java.util.Date;
import java.util.UUID;



import com.fasterxml.jackson.annotation.JsonFormat;

import Enumuration.Gender;
import Enumuration.MaritalStatus;
import ch.qos.logback.core.status.Status;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class StudentRegistrationDTO {

	private UUID id;
	private String firstName;
	private String middleName;
	private String lastName;
	private Status status;
	private MaritalStatus maritalStatus;
	private Gender gender;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date dateOfBirth;
	private String emailId;
	private String mobileNumber;
	private String birthPlace;
	private UUID birthStateId;
	private String birthStateName;
	private String identityMark;
	private UUID domicileCountryId;
	private String domicileCountryName;
	private UUID domicileStateId;
	private String domicileStateName;
	private UUID motherTongueId;
	private String motherTongueName;
	private String aadharNumber;
	private UUID nationalityId;
	private String nationalityName;
	private UUID religionId;
	private String religionName;
	private UUID casteId;
	private String casteName;
	private UUID categoryId;
	private String categoryName;
	private String registrationNumber;
	private Boolean isTransportAvailable;
	private UUID locationId;
	private String locationName;

	private String name;
	private String bankName;
	private String bankBranch;
	private String accountHolderName;
	private String accountName;
	private String panNumber;

	private UUID stdId;
	private String stdName;
	private UUID academicYearId;
	private String academicYearName;
	private UUID sessionId;
	private String sessionName;
	private String rollNumber;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date dateOfAdmission;
	private UUID admissionBatchId;
	private String admissionBatchName;
	private UUID admissionCategoryId;
	private String admissionCategoryName;
	private String userName;
	private String password;
	//private UserType userType;
	
	private String images;
	

//	private List<studentAddressInformation> addressInformationList;
//	private List<studentParentInformation> parentDetailsList;
//	private List<studentDocument> documentList;*/

}
