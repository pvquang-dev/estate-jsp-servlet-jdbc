package com.marcusdacoregio.authservice.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "roles")
public class RolesEntity {

	@Id
	@Column(name = "role_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Type(type = "org.hibernate.type.UUIDCharType")
	private UUID role_id;

	@Column(name = "project_id")
	@Type(type = "org.hibernate.type.UUIDCharType")
	private UUID project_id;

	@Column(name = "user_name")
	private String name;

	@ManyToOne(targetEntity = AuthorityEntity.class, fetch = FetchType.EAGER)
	@JoinColumn(name = "authority_id")
	@Type(type = "org.hibernate.type.UUIDCharType")
	private AuthorityEntity authority;

}
