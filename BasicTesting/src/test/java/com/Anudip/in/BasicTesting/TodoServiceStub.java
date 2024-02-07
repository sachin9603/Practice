package com.Anudip.in.BasicTesting;

import java.util.Arrays;
import java.util.List;

import service.TodoService;

public class TodoServiceStub  implements TodoService{

	// this is dummy data class  and dummy implementation 
	
	@Override
	public List<String> retieveTodos(String User) {
		// TODO Auto-generated method stub
		return Arrays.asList( "learn spring MVC" , "learn spring" , "learn to Dance"); 
	}
	

}
