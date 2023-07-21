package com.student.Project.Entity;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import Enumuration.Gender;
import Enumuration.MaritalStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_radhika_student")
public class Student extends RocordModifier {

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Type(type = "uuid-char")
	@Column(name = "id", updatable = false, nullable = false)
	private UUID id;

//	@NotNull(message = "firstName cannot be blank")
//	@ApiModelProperty(value = "valid firstName ", required = true, allowableValues = "NoEmpty String")
	@Column(name = "first_name")
	private String firstName;

//	@NotNull(message = "middleName cannot be blank")
//	@ApiModelProperty(value = "valid middleName ", required = true, allowableValues = "NoEmpty String")
	@Column(name = "middle_name")
	private String middleName;

//	@NotNull(message = "lastName cannot be blank")
//	@ApiModelProperty(value = "valid lastName ", required = true, allowableValues = "NoEmpty String")
	@Column(name = "last_name")
	private String lastName;

//	@NotNull(message = "maritalStatus cannot be blank")
//	@ApiModelProperty(value = "valid maritalStatus ", required = true, allowableValues = "  Married,Single")
	@Enumerated(EnumType.STRING)
	@Column(name = "marital_status")
	private MaritalStatus maritalStatus;

//	@NotNull(message = "gender cannot be blank")
//	@ApiModelProperty(value = "valid gender ", required = true, allowableValues = "Male,Female")
	@Enumerated(EnumType.STRING)
	@Column(name = "gender")
	private Gender gender;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	@Column(name = "date_of_birth")
	private Date dateOfBirth;

//	@NotNull(message = "emailId cannot be blank")
//	@ApiModelProperty(value = "valid emailId ", required = true, allowableValues = "NoEmpty String")
	@Column(name = "email_id")
	//@Email
	private String emailId;

//	@NotNull(message = "mobileNumber cannot be blank")
//	@ApiModelProperty(value = "valid mobileNumber ", required = true, allowableValues = "NoEmpty String")
	@Column(name = "mobile_number")
	private String mobileNumber;

//	@NotNull(message = "birthTable cannot be blank")
//	@ApiModelProperty(value = "valid birthTable ", required = true, allowableValues = "NoEmpty String")
	@Column(name = "birth_Place")
	private String birthPlace;

	@Type(type = "uuid-char")
	@Column(name = "birth_state_id")
	private UUID birthstateid;

//	@NotNull(message = "identityMark cannot be blank")
//	@ApiModelProperty(value = "valid identityMark ", required = true, allowableValues = "NoEmpty String")
	@Column(name = "identity_mark")
	private String identityMark;

	@Type(type = "uuid-char")
	@Column(name = "domicile_country_id")
	private UUID domicileCountryid;

	@Type(type = "uuid-char")
	@Column(name = "domicile_state_id")
	private UUID domicileStateid;

	@Type(type = "uuid-char")
	@Column(name = "mother_tongue_id")
	private UUID motherTongid;

//	@NotNull(message = "aadharNumber cannot be blank")
//	@ApiModelProperty(value = "valid aadharNumber ", required = true, allowableValues = "NoEmpty String")
	@Column(name = "aadhar_number")
	private String aadharNumber;

	@Type(type = "uuid-char")
	@Column(name = "nationality_id")
	private UUID nationalityid;

	@Type(type = "uuid-char")
	@Column(name = "religion_id")
	private UUID religionid;

	@Type(type = "uuid-char")
	@Column(name = "caste_id")
	private UUID casteid;

	@Type(type = "uuid-char")
	@Column(name = "category_id")
	private UUID categoryid;

//	@NotNull(message = "registrationNumber cannot be blank")
//	@ApiModelProperty(value = "valid registrationNumber ", required = true, allowableValues = "NoEmpty String")
	@Column(name = "registration_number")
	private String registrationNumber;

	@JsonManagedReference
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "student_id", referencedColumnName = "id",nullable=false)
	private List<StudentAddressInformation> studentAI;
	
	@JsonManagedReference
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "student_id", referencedColumnName = "id",nullable=false)
	private List<StudentParentDetails> studentPD;
 
}