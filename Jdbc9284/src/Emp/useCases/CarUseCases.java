package Emp.useCases;

import java.util.List;
import java.util.Scanner;

import Emp.model.Car;
import Emp.model.Employee;
import Emp.service.CarService;
import Emp.service.CarServiceImpl;
import Emp.service.EmployeeServiceImpl;


public class CarUseCases {

	

	private static Scanner sc  = new Scanner(System.in) ;
	private static  CarService carService  = new CarServiceImpl() ;
	
	
	
	
	public void carOperation()  {
		
		
		while(true ) {
			
			System.out.println("1 for registerdata \n"
					+ "2 for update \n"
					+ "3 for delete \n"
					+ "4 get data by id \n"
					+ "5 get all EMP \n"
					+ " 6 for exit" );
			
			int choice = sc .nextInt() ;
			
			switch (choice) {
			
			case 1  :
				System.out.println("Ohh! you want insert data ");
				Car  a   = new Car() ;
				
				System.out.println(" Enter Car id ");
			     a.setCarId(sc.nextInt());
				System.out.println("Enter car name ");
				
				a.setCarName(sc.next());
				
				System.out.println("Enter emp Id ");
				
				a.setEmpId(sc.nextInt());
				
			String ans =	carService.registerCar(a) ;
			System.out.println(ans);
			
			case 5  : 
//				
//				System.out.println("Ohh! you want entire data ");
//				
				
//				List<Employee> anss =	car.getAllEmp() ;
//				
//				
//				System.out.println(anss);
				
			case 6  : 
				return  ;
				
					
				
			}
		}
		
		
	}

}
