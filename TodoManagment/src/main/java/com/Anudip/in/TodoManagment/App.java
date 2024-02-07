package com.Anudip.in.TodoManagment;

import java.util.List;

import com.Anudip.in.TodoManagment.Service.TodoServiceImpl;
import com.Anudip.in.TodoManagment.Service.TodosService;

import Business.TodoBusinessImpl;

/**
 * Hello world!
 *
 */
public class App 
{
	
	// stub  ----
	
	 
    public static void main( String[] args )
    {
    	
    	TodosService service  =  new TodoServiceImpl() ;
    	
    //   List<String> allTodoRelated  =	service.retriveToDosList("rahul") ;
        
        TodoBusinessImpl b  = new TodoBusinessImpl(service) ;
        
        List<String> colletionsRelated  =   b.retriveTodosRelatedToCollection("sachin") ;
//    	
//       for (String s : allTodoRelated) {
//    	   System.out.println(s);
//       }
        
        System.out.println(colletionsRelated.size());
       
       for (String s : colletionsRelated) {
    	   System.out.println(s);
       }
    	
      //  System.out.println( "Hello World!" );
    }
}
