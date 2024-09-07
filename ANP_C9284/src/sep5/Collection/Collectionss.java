package sep5.Collection;

import java.util.ArrayList;
import java.util.List;

import aug21.Student;
import aug21.Address;

public class Collectionss {
	
	public static void main(String[] args) {
		
		// arraylist is dynamic in size 
		List<Student>   list  = new ArrayList<>() ;
		
		list.add(new Student(232 , "sdadfa " , new Address("asdas" ,"dfdsf",8989))) ;
		
		
		// what are the genric in java 
		// for the type saftey 
		
		
     List list22  = new ArrayList<>() ;
		
     list22.add("rajal") ;
     list22.add("imbsat" ) ;
     list22.add("anajli") ;
     list22.add("pooja") ;
     list22.add("swati") ;
     
     list22.add(44) ;
     list22.add(true) ;
     list22.add(33.53) ;
     list22.add(false) ;
    ;
     
     
     list.addAll(list22) ;
		System.out.println("sabke naam ");
		
		
		list.remove("pooja") ;
		
		list.add("pooja") ;
		
		list.add(2, "devi prasaad ");

		
		
		
	
	 System.out.println(list);
		
		
		System.out.println(list.size());
		
		System.out.println(list.contains("sachin"));
	}

}
