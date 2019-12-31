package com.marcusdacoregio.authservice.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import com.marcusdacoregio.authservice.enums.RolesEnum;

@Entity
@Table(name = "authority")
public class AuthorityEntity {
	
	@Id
	@Column(name = "authority_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Type(type = "org.hibernate.type.UUIDCharType")
	private UUID authority_id;

	@Column(name="name")
	private String name;
	
	private RolesEnum roles;

	public UUID getAuthority_id() {
		return authority_id;
	}

	public void setAuthority_id(UUID authority_id) {
		this.authority_id = authority_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public RolesEnum getRoles() {
		return roles;
	}

	public void setRoles(RolesEnum roles) {
		this.roles = roles;
	}	
}
