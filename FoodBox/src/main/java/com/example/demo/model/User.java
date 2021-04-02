package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int id;
	
	private String emailId;
	
	private String password;
	
	private String userName;
	
	private int phoneNumber;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public User(int id, String emailId, String password, String userName, int phoneNumber) {
		super();
		this.id = id;
		this.emailId = emailId;
		this.password = password;
		this.userName = userName;
		this.phoneNumber = phoneNumber;
	}


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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", emailId=" + emailId + ", password=" + password + ", userName=" + userName
				+ ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	
	
	
	
	
}
