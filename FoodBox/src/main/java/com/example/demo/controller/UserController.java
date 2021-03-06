package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	@PostMapping("/register")
	@CrossOrigin(origins ="http://localhost:4200")
	public User registerUser(@RequestBody User user) {
return userservice.saveUser(user);	
		
	}
	
	@GetMapping("/users")
	public List<User> list() {
	    return userservice.listAll();
	}
	 
	@PostMapping("/login")
	@CrossOrigin(origins ="http://localhost:4200")
	public User loginuser(@RequestBody User user) throws Exception {
		String tempemail= user.getEmailId();
		String temppassword= user.getPassword();
		User userObj=null;
		if(tempemail!=null && temppassword!=null) {
			userObj= userservice.loginservice(tempemail, temppassword);}
		if(userObj==null) {
			throw new Exception("wrong credentials");
		}
		return userObj;
	}

}
