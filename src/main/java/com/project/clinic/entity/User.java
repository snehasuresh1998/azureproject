package com.project.clinic.entity;

import java.util.Collection;

import javax.management.relation.Role;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
	@Id
	private String id;
	
	
	private String userName;
	

	
	private String role;
	
	private String password;
	
	
	public User() {
		
	}
	
	public User(String userName,  String password, Collection<Role> roles) {
		super();
		this.userName = userName;
		
		this.password = password;
	
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
