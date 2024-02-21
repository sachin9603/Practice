package feb19;

import java.util.*;

public class Demo {
	public static void main(String[] args) {
		
		Employee e1  =new Employee(1, "RAJU" , 60000) ;
	   System.out.println(e1.hashCode());
	   
	   
		Employee e2  =new Employee(1, "RAJU" , 60000) ;
		//what is diffence between == and equals
		System.out.println(e1.equals(e2));
		System.out.println(e2.hashCode());
		
		System.out.println(e1==e2);
		
		Employee e3  =new Employee(3, "nita" , 68000) ;
		Employee e4  =new Employee(4, "RAJ" , 65000) ;
		Employee e5 =new Employee(5, "Aman" , 69000) ;
		
		ArrayList<Employee>  li  = new ArrayList<>() ;
		li.add(e4) ;
		li.add(e2) ;
		li.add(e3) ;
		li.add(e1) ;
		li.add(e5) ;
		
		
		System.out.println(li.hashCode());
		
		Collections.sort(li , new nameAndSalaryComparator());
		
		// i want to sort the data on the baises of name , salaray , id 
		
		
		System.out.println(li);
		
		
		String s1 = "Aa";
		String s2  = "BB" ;
		
		System.out.println(s1.equals(s2)); // content 
		System.out.println(s1 == s2 ); // location 
		
		// if hashcode is same for two object 
		System.out.println(s1.hashCode()); 
		System.out.println(s2.hashCode());
	//	 if two objects are equal to each other based on equals()
		//method, then the hash code must be the same,
		
	}

}
