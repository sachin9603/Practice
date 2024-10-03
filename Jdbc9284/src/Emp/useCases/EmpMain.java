package Emp.useCases;

import java.util.Scanner;

import Emp.model.Employee;
import Emp.service.EmployeeServiceImpl;
import Emp.service.EmployeeServicee;

public class EmpMain {
	
	private static Scanner sc  = new Scanner(System.in) ;
	private static EmployeeServicee empService = new EmployeeServiceImpl() ;
	
	
	
	public static void main(String[] args) {
		
		
		while(true ) {
			
			System.out.println("1 for registerdata \n"
					+ "2 for update");
			
			int choice = sc .nextInt() ;
			
			switch (choice) {
			
			case 1  :
				System.out.println("Ohh! you want insert data ");
				Employee d  = new Employee ()  ;
				System.out.println(" Enter emp id ");
				d.setEid(sc.nextInt());
				
				System.out.println("Enter emp name ");
				
				d.setName(sc.next());
				
				System.out.println("Enter emp Salary");
				
				d.setSalary(sc.nextDouble());
				
			String ans =	empService.registerEmp(d) ;
			System.out.println(ans);
				
			}
		}
		
		
	}

}
