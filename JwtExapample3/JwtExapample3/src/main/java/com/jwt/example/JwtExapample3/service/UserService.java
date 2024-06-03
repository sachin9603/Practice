package com.jwt.example.JwtExapample3.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwt.example.JwtExapample3.model.User;

@Service
public class UserService {
	
	private List<User> store  = new ArrayList<User>() ;
	
	
	public UserService() {
		
		store.add(new User(UUID.randomUUID().toString() ,"Sachin Parmar" ,"Sachin.parmar@gmail.co")) ;
		store.add(new User(UUID.randomUUID().toString() ,"pooja Parmar" ,"pooja.parmar@gmail.co")) ;
		store.add(new User(UUID.randomUUID().toString() ,"swati Paramar" ,"swati.parmar@gmail.co")) ;
        store.add(new User(UUID.randomUUID().toString() ,"pinjara Parmar" ,"pinjara.parmar@gmail.co")) ;

	}
	
	
	public List<User> getUsers() 
	{
		return this.store ;
		
	}
	
	
	

}
