package com.service.oauth2.model.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import lombok.Data;

@Data
@MappedSuperclass
public class BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Version
	protected Long version;

	protected LocalDateTime createdOn = LocalDateTime.now();

	protected LocalDateTime updatedOn = LocalDateTime.now();

	protected LocalDateTime deletedOn = LocalDateTime.now();

	protected Long createdBy;

	protected Long updatedBy;

}
