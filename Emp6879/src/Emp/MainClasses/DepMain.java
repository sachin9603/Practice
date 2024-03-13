package Emp.MainClasses;

import java.util.Scanner;

import Emp.Dao.DepartmentDao;
import Emp.Dao.EmployeeDao;
import Emp.Daoimpl.DepartmentDaoImpl;
import Emp.Daoimpl.EmployeeDaoImpl;
import Emp.Exception.EmployeeException;
import Emp.model.Deparment;
import Emp.model.Employee;

public class DepMain {
	
	private static Scanner sc  = new Scanner(System.in);
	
	private static DepartmentDao  dao  = new DepartmentDaoImpl() ;
	
	public static void main(String[] args) {
		
	boolean flg  = true ;
	
	while(flg) {
		System.out.println(" 1 for register department");
		
	int choice  = sc.nextInt();
	
	switch(choice) {
	case 1 :
		System.out.println("ok you want department ");
		System.out.println("enter Department Id");
		int id   = sc.nextInt() ;
		
		System.out.println("enter Department Name");
		String depname  = sc.next() ;
		
		
		try {
			Deparment  e  = new Deparment(id , depname) ;
			
			String msg = dao.registerdep(e) ;
			
			if(msg.equals("not register")) {
				
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
