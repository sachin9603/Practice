package feb19;

import java.util.*;

public class Demo {
	public static void main(String[] args) {
		
		Employee e1  =new Employee(1, "RAJU" , 60000) ;
		Employee e2  =new Employee(2, "puja" , 69000) ;
		Employee e3  =new Employee(3, "nita" , 68000) ;
		Employee e4  =new Employee(4, "takur" , 65000) ;
		
		ArrayList<Employee>  li  = new ArrayList<>() ;
		li.add(e4) ;
		li.add(e2) ;
		li.add(e3) ;
		li.add(e1) ;
		System.out.println(li);
		
		Collections.sort(li);
//		for (Employee s: li) {
//			
//			System.out.println(s.getEmpID() + "  ---- >" + s.getEmpSalary());
//			
//		}
		
		System.out.println(li);
		
		
	}

}
