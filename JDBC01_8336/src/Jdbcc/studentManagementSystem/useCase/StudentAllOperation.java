package studentManagementSystem.useCase;

import java.util.ArrayList;
import java.util.Scanner;

import studentManagementSystem.model.Student;
import studentManagementSystem.service.studentService;
import studentManagementSystem.serviceImpl.StudentServiceImpl;

public class StudentAllOperation {
	 
	public Scanner sc = new Scanner(System.in) ;
	public studentService  service   = new StudentServiceImpl()  ;
//	StudentAllOperation obj = new StudentAllOperation() ;
	
	
	public  Student getStudentData() {
		
		System.out.println("please enter student Rollnumber ");
		Integer rollNumber  = sc.nextInt() ;
		
		System.out.println("please enter student Name ");
		String name  = sc.next() ;
		
		System.out.println("please enter student Address ");
		String address  = sc.next() ;
		
		System.out.println("please enter student Class ");
		int classData  = sc.nextInt() ;
		
		return new Student(rollNumber , name  , address , classData)  ;
		
	}
	
	public void allOps() {
		
		System.out.println("click 1 for register student \n "
				+ "click 2 for all student \n"
				+ "click 3 for all student from particular class \\n");
		int choice  = sc.nextInt() ;
		
		switch (choice) {
		
		case 1 :  
			
		String ans  = 	service.registerStudent(getStudentData()) ;
		System.out.println(ans);
			break  ;
			
       case 2 :  
			
    	  ArrayList<Student>  list  =  service.getAllStudent() ;
    	   for (Student s :list) {
    		   System.out.println(s);
    	   }
			break  ;
			
       case 3 :  
			System.out.println("please enter your class name");
			
			String className =  sc.next() ;
     	  ArrayList<Student>  listt  =  service.getAllstudentByClassName(className) ;
     	   for (Student s :listt) {
     		   System.out.println(s);
     	   }
 			break  ;
			
			
		
		}
		
		
		
	}
	
	

}
