package studentManagementSystem.useCase;

import java.util.ArrayList;
import java.util.Scanner;

import studentManagementSystem.model.Student;
import studentManagementSystem.service.studentService;
import studentManagementSystem.serviceImpl.StudentServiceImpl;

public class StudentAllOperation {
	 
	public Scanner sc = new Scanner(System.in) ;
	public studentService  service   = new StudentServiceImpl()  ;
	
	
	public void allOps() {
		
		System.out.println("click 1 for regiter student \n "
				+ "click 2 for all student ");
		
		
		int choice  = sc.nextInt() ;
		
		switch (choice) {
		
		case 1 :  
			
			break  ;
			
       case 2 :  
			
    	  ArrayList<Student>  list  =  service.getAllStudent() ;
    	   for (Student s :list) {
    		   System.out.println(s);
    	   }
			break  ;
			
			
		
		}
		
		
		
	}
	
	

}
