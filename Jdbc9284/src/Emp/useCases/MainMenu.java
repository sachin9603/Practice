package Emp.useCases;

import java.util.Scanner;

public class MainMenu {
	
	static Scanner sc  = new Scanner(System.in) ;
	
	
	public static void main(String[] args) {
		EmpMain empStuff   = new EmpMain() ;
		CarUseCases  carStuff = new CarUseCases() ;
		
		while(true) {
			System.out.println( " 1 for employee stuff \n  "
					+ " 2 for car Stuff \n"
					+ " 3 for department stuff ");
			
			int choice   = sc.nextInt()  ;
			
			switch(choice) {
			
			case 1  :
				
				empStuff.EmployeeOperation() ;
				break ;
				
			case 2  :
				carStuff.carOperation() ;
				break  ;
				
			case 3   :
				
				System.exit(1);
				


			
				
				
				
				
			
			
			
			}
			
			
		}
		
		
		
	}

}
