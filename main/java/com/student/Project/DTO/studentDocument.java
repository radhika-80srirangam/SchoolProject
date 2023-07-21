package com.student.Project.DTO;

import java.util.Date;
import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class studentDocument {

	private UUID id;
	private String document;
	private Date uploadDate;
	private String Status;

}
