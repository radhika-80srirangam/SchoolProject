package com.student.Project.Entity;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import Enumuration.Status;


@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "modifiedOn", "createdOn", "deletedOn", "deletedBy", "modifiedBy", "createdBy",
		"status" })

public class RocordModifier {

	@CreatedBy
	@Column(name = "created_by", nullable = false, updatable = false)
	private String createdBy;

	@CreatedDate
	@Column(name = "created_on", nullable = false, updatable = false)
	private String createdOn;

	@LastModifiedBy
	@Column(name = "modified_by", nullable = false)
	private String modifiedBy;

	@LastModifiedDate
	@Column(name = "modified_on", nullable = false)
	private LocalDateTime modifiedOn;

	@Column(name = "deleted_on")
	private Date deletedOn;

	@Column(name = "deleted_by")
	private String deletedBy;

//	@NotNull(message = "Status cannot be blank")
//	@ApiModelProperty(value = "Valid status", required = true,allowableValues = "ACTIVE, INACTIVE")
	@Enumerated(EnumType.STRING )
	@Column(name = "status")
	private Status status;

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public LocalDateTime getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(LocalDateTime modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public Date getDeletedOn() {
		return deletedOn;
	}

	public void setDeletedOn(Date deletedOn) {
		this.deletedOn = deletedOn;
	}

	public String getDeletedBy() {
		return deletedBy;
	}

	public void setDeletedBy(String deletedBy) {
		this.deletedBy = deletedBy;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

		
	
	
	

}
