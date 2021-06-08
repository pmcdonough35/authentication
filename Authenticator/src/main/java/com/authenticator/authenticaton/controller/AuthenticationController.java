package com.authenticator.authenticaton.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.authenticator.authenticaton.model.User;
import com.authenticator.authenticaton.service.AuthenticationService;

@RestController
public class AuthenticationController {
	
	@Autowired
	private AuthenticationService serv;
	
	//Register user
	@PostMapping("/registeruser")
	//Allow endpoint to be accessible from angular port
	@CrossOrigin(origins = "http://localhost:4200")
	public User registerUser(@RequestBody User user) throws Exception {
		
		//Check if email already exists
		String tempEmailId = user.getEmailId();
		if (tempEmailId != null && !"".equals(tempEmailId)) {
			User userObj = serv.fetchUserByEmailId(tempEmailId);
			if (userObj != null) {
				throw new Exception("user with " + tempEmailId + " already exists");
			}
		}
		User userObj = null;
		//Save to DB
		userObj = serv.saveUser(user);
		return userObj;
	}
	
	//Login user
	@PostMapping("/login")
	//Allow endpoint to be accessible from angular port
	@CrossOrigin(origins = "http://localhost:4200")
	public User loginUser(@RequestBody User user) throws Exception {
		String tempEmailId = user.getEmailId();
		String tempPassword = user.getPassword();
		User userObj = null;
		if (tempEmailId != null && tempPassword != null) {
			userObj = serv.fetchUserByEmailIdAndPassword(tempEmailId, tempPassword);
		}
		
		//Check if username and password valid
		if (userObj == null) {
			throw new Exception("Invalid credentials");
		}
		return userObj;
	}
}
