package com.jwt.example.JwtExapample3.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.example.JwtExapample3.model.User;
import com.jwt.example.JwtExapample3.service.UserService;

@RestController
@RequestMapping("/home")

public class home_controller {
	
	//http://localhost:8089/home/users
	
	@Autowired
	private UserService userService ;
	
	
	@GetMapping("/users")
	public List<User> getUser(){
	   System.out.println("getting users ");
		
		return this.userService.getUsers() ;
		
	}

}
