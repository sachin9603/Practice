package Emp.Uitlity;

import java.util.List;

import Emp.model.Employee;

public class queryUtil {
	
	public static String register() {
		
		return  "insert into Employee value(?,?,?,?)" ;
		
	}
	
	
    public static String getEmpById() {
		
		return  "select * from Employee where id = ?" ;
		
	}

    
    public static String getALLEmp() {
		
		return  "select * from Employee" ;
		
	}
    
    public static String getallEmpbydepId() {
    	return "select * from employee where depId = ? " ;
    	
    }



}
