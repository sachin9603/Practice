package Emp.MainClasses;

import java.util.List;
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
		
		System.out.println(" 2 for get All employee");
		
		System.out.println(" 3 for get employee by id");
		
		System.out.println(" 4  for highest salary department wise ");
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
		break ;
		
	case 2  :
		
		try {
			
			List<Employee> list  = dao.getAllEmp();
			for(Employee d:list) {
				System.out.println(d);
			}
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	case 3 : 
		
		System.out.println("you have to get emp data by id ");
		
		System.out.println("kindly give emp id");
		
		int eid = sc.nextInt();
		
		try {
			Employee e  = dao.getEmpByID(eid);
			System.out.println(e);
			
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		break ;
case 4 : 
		
	dao.gethighestsalaryDepartmentwise();
		
		
	}
		
	}
		
		
	}

}
