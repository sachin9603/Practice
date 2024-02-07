package jan9;

import java.util.ArrayList;
import java.util.Collections;

public class StudentTest {

	public static void main(String[] args) {
		
		ArrayList<Student>  arr = new ArrayList<Student>() ;
		
		ArrayList<String>  a = new ArrayList<String>() ;
		a.add("zacb") ;
		a.add("awcb") ;
		a.add("awrcb") ;
		a.add("axxcb") ;
		
		Collections.sort(a);
		
		System.out.println(a);


	
		Student s1  = new Student(1, "Sachin" , 500) ;
		arr.add(s1) ;
		
		arr.add(new Student(2, "zzzRahul" , 420)) ;

		arr.add(new Student(3, "Ravi" , 420)) ;

		arr.add(new Student(4, "Vishal" , 470)) ;
		
//		String s = "ram " ;
//		Integer 
		Collections.sort(arr);
		System.out.println(arr);

//		
		
ArrayList<Student2>  arr2 = new ArrayList<Student2>() ;
		
		arr2.add(new Student2(1, "Riya" , 500)) ;
		arr2.add(new Student2(2, "zzzriya" , 420)) ;

		arr2.add(new Student2(3, "aiya" , 420)) ;

		arr2.add(new Student2(4, "Kiya" , 40)) ;
		
		Collections.sort(arr2, new NumberComparator());
		System.out.println(arr2);

		
		
	}
}
