package Anudip.EmployeeApp9284Hibernate.usecase;

import java.util.Scanner;

import Anudip.EmployeeApp9284Hibernate.model.Employee;
import Anudip.EmployeeApp9284Hibernate.service.EmployeeService;
import Anudip.EmployeeApp9284Hibernate.serviceImpl.EmployeeServiceImpl;

public class Alloperation {
//	private int employeeId  ;
//	private String employeeName;
//	private String employeeUsername ;
	
	public static Scanner sc  = new Scanner(System.in)  ;
    
	static EmployeeService  es = new EmployeeServiceImpl() ;
	
	public static Employee inputFromEmployee() {
		
		System.out.println("Enter Employee id ");
		int id = sc.nextInt() ;
		
		System.out.println("Enter Employee  name");
		String name  = sc.next() ;
		
		System.out.println("Enter Employee  username");
		String username  = sc.next() ;
		
		Employee ee  = new Employee() ;
	//	ee.setEmployeeId(id);
		ee.setEmployeeName(name);
		ee.setEmployeeUsername(username);
		System.out.println(ee);
		
		
		return ee ;
		
	}
	
	public static void employeeOperation() {
		while(true ) {
			System.out.println("Welcome to  Employee MST \n"
					+ "press 1 for creating account  \n"
					+ "press 2 for delete account  \n"
					+ "press 3 for update account  \n"
					+ "press 5 for exit \n");
			
			int choice  = sc.nextInt()  ;
			
			switch(choice) {
			
			case 1  :
				System.out.println("Ok you  want to insert data ");
				
				  
				
				boolean ans =es.createEmployeeAccount(inputFromEmployee() ) ;
				
				System.out.println("yes you are successfully registered ");
				
				break ;
				
				
			case 2 :
				
	         boolean ans2 =es.updateEmployee(inputFromEmployee() ) ;
				
				System.out.println("yes you are successfully updated ");
				
				break ;
				
			case 5 :
				
		       return ;
		       
					
		}
			
		}
		
		
		
		
		
		
		
		
		
	}
	
	
//   public void departmentOperation() {
//		
//		System.out.println("Welcome to  Employee MST /n"
//				+ "press 1 for creating account  /n"
//				+ "press 2 for creating account  /n"
//				+ "press 3 for creating account  /n"
//				+ "press 4 for creating account  /n");
//		
//		
//		
//		
//		
//	}
	
	
	

}
