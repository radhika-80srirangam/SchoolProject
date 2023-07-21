package com.student.Project.Entity;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonBackReference;

import Enumuration.ParentDetailsType;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "tb_radhika_parent_details")
public class StudentParentDetails extends RocordModifier implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Type(type = "uuid-char")
	@Column(name = "id", updatable = false, nullable = false)
	private UUID id;

//	@NotNull(message = "Student Parent Details cannot be blank")
//	@ApiModelProperty(value = "name", required = true, allowableValues = "String")
	@Column(name = "first_name")
	private String firstName;

//	@NotNull(message = "Student Parent Details cannot be blank")
//	@ApiModelProperty(value = "name", required = true, allowableValues = "String")
	@Column(name = "last_name")
	private String lastName;

//	@NotNull(message = "Student Parent Details cannot be blank")
//	@ApiModelProperty(value = "name", required = true, allowableValues = "String")
	@Column(name = "email_id")
	private String emailId;

//	@NotNull(message = "Student Parent Details cannot be blank")
//	@ApiModelProperty(value = "name", required = true, allowableValues = "String")
	@Column(name = "mobile_number")
	private String mobileNumber;

//	@NotNull(message = "Student Parent Details cannot be blank")
//	@ApiModelProperty(value = "name", required = true, allowableValues = "String")
	@Column(name = "designation")
	private String designation;

	@Type(type = "uuid-char")
	@Column(name = "occupation_id")
	private UUID occupationId;

//	@NotNull(message = "Student Parent Details cannot be blank")
//	@ApiModelProperty(value = "name", required = true, allowableValues = "String")
	@Column(name = "organization_name")
	private String organizationName;

//	@NotNull(message = "Student Parent Details cannot be blank")
//	@ApiModelProperty(value = "name", required = true, allowableValues = "String")
	@Column(name = "annual_income")
	private String annualIncome;

//	@NotNull(message = "ParentDetailsType cannot be blank")
//	@ApiModelProperty(value = "valid parentDetailsType ", required = true, allowableValues = "  Father_Information,Mother_Information,Local_Guardian_Information")
	@Enumerated(EnumType.STRING)
	@Column(name = "parent_details_type")
	private ParentDetailsType parentDetailsType;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "student_id",nullable = false ,insertable = false ,updatable = false)
	private Student studentpd;
	
	//parents user creation
//	@Formula(value = "Concat(first_name,IF(middle_name is null,'',concat(' ',middle_name)),' ',last_name)")
//	private String concatFields;
	


}
