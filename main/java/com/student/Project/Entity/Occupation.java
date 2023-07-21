package com.student.Project.Entity;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;


import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_radhika_occupation")
@Getter
@Setter

public class Occupation extends RocordModifier implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Type(type = "uuid-char")
	@Column(name = "id", updatable = false, nullable = false)
	private UUID id;

//	@NotNull(message = "Name cannot be empty")
//	@ApiModelProperty(value = "name", required = true, allowableValues = "String")
	@Column(name = "name")
	private String name;
}
