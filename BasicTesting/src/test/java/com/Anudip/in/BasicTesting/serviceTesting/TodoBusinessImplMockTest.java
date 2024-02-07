package com.Anudip.in.BasicTesting.serviceTesting;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import bussiness.TodoBussinessImpl;
import junit.framework.Assert;
import service.CalculatorService;
import service.TodoService;

public class TodoBusinessImplMockTest {
	
	// what is mocking ?
	// mocking is creating object that simulate the behaviour or real objects.
	//unlike stubs , mock can be dynamically created from code - at runtime.  
	// mock offer more functionality than stubs and alot of other things  
	

	
	
	
	@Test
	public void testRetriveTodosRelatedToSpring_UsingMock() {

		//@SuppressWarnings("unused")
		
		TodoService mockTodoService  = mock(TodoService.class);
		
		List<String> todos = Arrays.asList("learn spring MVC" , "learn yyyy spring","learn spring" , "learn to Dance") ;
		
		when(mockTodoService.retieveTodos("Dummy")).thenReturn(todos) ;
	
		TodoBussinessImpl todoBussinessImpl = new TodoBussinessImpl(mockTodoService) ;
		
		List<String> pp = todoBussinessImpl.retriveTodosRelatedToSpring("Dummy") ;
		
		Assert.assertEquals(3,pp.size() );
		
		
		System.out.println("Sachin");
		
		
		
	}
	/// suppose i want a case when it related a stud when it will return only one value back 
	
	
	// yes i  can do this thinng like if user is dummy1 then return some thing else or if dummy2 then return something else 
	
	// suppose i have added some method into the interface then i have to add this method into the stub again 
	
	
	//  in this why it will become complex and comples 
	
	
	@Test
	public void Checknum() {
		
		Assert.assertEquals(12 , 12);
	}
	
	
}
