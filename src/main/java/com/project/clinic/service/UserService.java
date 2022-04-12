package com.project.clinic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.clinic.entity.User;
import com.project.clinic.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository urepo;
	
	public void addUser(User u) {
		urepo.save(u);
	}

}
