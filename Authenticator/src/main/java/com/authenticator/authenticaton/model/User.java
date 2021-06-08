package com.authenticator.authenticaton.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Create DB table
@Entity
public class User {
	
	//Specify primary key
	@Id
	//Indicates that persistence provider must assign primary keys for entity using a database identity column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String emailId;
	private String userName;
	private String password;
	
	public User() {
	}
	
	public User(int id, String emailId, String userName, String password) {
		super();
		this.id = id;
		this.emailId = emailId;
		this.userName = userName;
		this.password = password;
	}
	
	//Getters and Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
