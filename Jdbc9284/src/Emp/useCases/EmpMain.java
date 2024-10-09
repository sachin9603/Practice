package Emp.useCases;

import java.util.List;
import java.util.Scanner;

import Emp.model.Employee;
import Emp.service.EmployeeServiceImpl;
import Emp.service.EmployeeServicee;

public class EmpMain {
	
	private static Scanner sc  = new Scanner(System.in) ;
	private static EmployeeServicee empService = new EmployeeServiceImpl() ;
	
	
	
	public void  EmployeeOperation(){
		
		
		while(true ) {
			
				System.out.println("1 for registerdata \n"
					+ "2 for update \n"
					+ "3 for delete \n"
					+ "4 get data by id \n"
					+ "5 get all EMP \n"
					+ "6 for exit " );
			
			
			
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
			break  ;
			
			case 5  : 
				
				System.out.println("Ohh! you want entire data ");
				
				List<Employee> anss =	empService.getAllEmp() ;
				
				
				System.out.println(anss);
				break ;
			case 6  :
				return  ;
				
			}
		}
		
		
	}

}
