package jul24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {
	
	public static void main(String[] args) {
		
	
//		System.out.println("sorting by name ");
//		
//		
//		
//		Collections.sort(list, new Comparator(){
//			
//			@Override
//			public int compare(Object o1, Object o2) {
//				// TODO Auto-generated method stub
//				
//		         Employee e1  = (Employee)o1 ;
//				
//				Employee e2  = (Employee)o2 ;
//				
//				
//				return   e1.name.compareTo(e2.name) ;
//			}
//			
//		});
//		
//		
//		for (Employee e: list) {
//			
//			System.out.println(e);
//			
//		}
		
		
		ArrayList<Employee> list  = new ArrayList<Employee>();
		
		list.add(new Employee(101  , "Piyush" , 50000));
		
		list.add(new Employee(104  , "Priya" , 50000));
		list.add(new Employee(103  , "Pankaj" , 50600));
		list.add(new Employee(102  , "Prerna" , 554000));
		list.add(new Employee(105  , "Pragya" , 503000));
		
		System.out.println("sorting by IDD ");
		
		Collections.sort(list, new IdComparator());

		
		
		for (Employee e: list) {
			
			System.out.println(e);
			
		}
		
		
	}

}
