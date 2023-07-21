package com.student.Project.DTO;

import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class studentAddressInformation {

	private UUID id;
	private String address;
	private String pincode;
	private UUID countryId;
	private String countryName;
	private UUID stateId;
	private String stateName;
	private UUID cityId;
	private String cityName;
	private String addressType;

}
