package com.service.oauth2.model.entity;

import lombok.Data;

import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import java.io.Serializable;
import java.time.LocalDateTime;

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
