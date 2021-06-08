package com.authenticator.authenticaton.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.authenticator.authenticaton.model.User;
import com.authenticator.authenticaton.repository.AuthenticationRepository;

@Service
public class AuthenticationService {
	
	@Autowired
	private AuthenticationRepository rep; 
	//Save user to DB
	public User saveUser(User user) {
		return rep.save(user);
	}
	
	//Get a user by email
	public User fetchUserByEmailId(String email) {
		return rep.findByEmailId(email);
	}
	
	//Get a user by email
	public User fetchUserByEmailIdAndPassword(String email, String password) {
		return rep.findByEmailIdAndPassword(email, password);
	}

}
