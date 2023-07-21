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

import Enumuration.AddressType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_radhika_student_address")
public class StudentAddressInformation extends RocordModifier implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Type(type = "uuid-char")
	@Column(name = "id", updatable = false, nullable = false)
	private UUID id;

	//@NotNull(message = "Student address cannot be blank")
	@Column(name = "address")
	private String address;
	
	//@NotNull(message = "Student pincode cannot be blank")
	@Column(name = "pin_code")
	private String pincode;
	
	@Type(type="uuid-char")
	@Column(name = "country_id")
	private UUID countryObj;

	@Type(type="uuid-char")
	@Column(name = "state_id")
	private UUID stateObj;

	@Type(type="uuid-char")
	@Column(name = "city_id")
	private UUID cityObj;

//	@NotNull(message = "AddressType cannot be blank")
//	@ApiModelProperty(value = "valid addressType ", required = true, allowableValues = "  Permanent_Address,Local_Address")
	@Enumerated(EnumType.STRING)
	@Column(name = "address_type")
	private AddressType addressType;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "student_id",nullable = false ,insertable = false ,updatable = false)
	private Student studeId;

}
