package com.Anudip.in.BasicTesting;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;

import bussiness.TodoBussinessImpl;

public class TodoBusinessImplStubTest {

	@Test
	public void test() {
		
		TodoServiceStub  todoServiceStub  = new TodoServiceStub() ;
		
		TodoBussinessImpl  todoBusinessImpl  =  new TodoBussinessImpl(todoServiceStub) ;
		
		List<String > fileteredTodos = todoBusinessImpl .retriveTodosRelatedToSpring("Dummy");
	//	System.out.println( fileteredTodos.size());
		assertEquals(2,fileteredTodos.size() );
		 
	}
	/// suppose i want a case when it related a stud when it will return only one value back 
	
	
	// yes i  can do this thinng like if user is dummy1 then return some thing else or if dummy2 then return something else 
	
	// suppose i have added some method into the interface then i have to add this method into the stub again 
	
	
	//  in this why it will become complex and comples 
	
	
	///Beheviour driven 
	
	
	
	
}
