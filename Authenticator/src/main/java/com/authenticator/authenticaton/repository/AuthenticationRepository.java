package com.authenticator.authenticaton.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.authenticator.authenticaton.model.User;

public interface AuthenticationRepository extends JpaRepository<User, Integer> {
	
	//Get a user by email from DB
	public User findByEmailId(String emailId);
	
	//Get a user by email and password from DB
	public User findByEmailIdAndPassword(String emailId, String password);

}
