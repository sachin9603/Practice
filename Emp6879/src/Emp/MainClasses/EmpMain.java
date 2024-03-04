package Emp.MainClasses;

import java.util.Scanner;

import Emp.Dao.EmployeeDao;
import Emp.Daoimpl.EmployeeDaoImpl;
import Emp.Exception.EmployeeException;
import Emp.model.Employee;

public class EmpMain {
	private static Scanner sc  = new Scanner(System.in);
	
	private static EmployeeDao  dao  = new EmployeeDaoImpl() ;
	
	public static void main(String[] args) {
		
	boolean flg  = true ;
	
	while(flg) {
		System.out.println(" 1 for register employee");
		
	int choice  = sc.nextInt();
	
	switch(choice) {
	case 1 :
		System.out.println("ok you want employee");
		System.out.println("enter Employee Id");
		int id   = sc.nextInt() ;
		
		System.out.println("enter Employee Name");
		String name  = sc.next() ;
		
		System.out.println("enter Employee Salary");
		Double salary  =  sc.nextDouble() ;
		
		System.out.println("enter Employee department id");
		int did  =  sc.nextInt() ;
		try {
			Employee  e  = new Employee(id , name  , salary ) ;
			e.setDepid(did);
			String msg = dao.registerEmp(e) ;
			if(msg.equals("emplyee is not registered")) {
				
				throw new EmployeeException("something went wrong");
				
			}
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
		
	}
		
		
	}

}
