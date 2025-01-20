package dec12.Collectionn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

public class ListList {
	
	//  internal working of each class you need to know  
	
	// ArrayList 
	// 
	// dynamic array which can its size 
	// it will allow n number  duplicate value 
	// it will n number of null value 
	// it will maintain insertion order also 
	// if you are not providing genric <> then it will not be type safe 
	
	
	
	
	public static void main(String[] args) {
		
		ArrayList listt  = new ArrayList<>();
		
		System.out.println(listt.size() );
		
		Student s1  = new Student()  ;
		s1.setMarks(22333);
		s1.setName("RahulRanrajan");
		s1.setRollno(78879789);
		
		listt.add(s1) ;
		
		
		listt.add(true) ;
		listt.add(12) ;
		listt.add(12) ;
		listt.add(12) ;
		listt.add(null) ;
		
		listt.add(null) ;
		
	for(int i =0  ;i< listt.size() ;i++) {
		System.out.println(listt.get(i));
	}
		
	// please create your own arraylist  now 
	
	System.out.println(listt);
	
	
	System.out.println("----------------------linked List ---------------------");
	
	
	
	
	// it is btter to use for deletion and insertion bcz data is getting stored in the from of node 
	LinkedList<String> nameLinkedList  = new LinkedList<>()  ;
	
	
	nameLinkedList.add("aman");
	nameLinkedList.add("aman");
	nameLinkedList.add("aman");
	nameLinkedList.add("aman");
	nameLinkedList.add(null);
	nameLinkedList.add(null);
	
	nameLinkedList.add(null);
	nameLinkedList.add(null);
	
	System.out.println(nameLinkedList);
	
	
	
	
	/// same as arraylist 100 percent but it thread safe and synchronized
	Vector<String > vectorr  = new Vector<> ()  ;
	
	vectorr.add("Sachin") ;
	
	vectorr.add("Sachin") ;
	vectorr.add("Raju") ;
	vectorr.add("Sachin") ;
    System.out.println(vectorr);
    
    
    Stack<String> st = new Stack<>()  ;
    
    st.add("Sachin") ;
    
    st.add("archi") ;

    st.add("Vishnu") ;

    st.add("Rohit") ;

  //// push   ---- aakshi mai data fit karta ahai  pop   peek
    
    
    System.out.println(st.pop() ); //rohit out 
System.out.println(st.peek() ); // vishnu 
System.out.println(st.push("pritam"));

System.out.println(st);




System.out.println("--------------------Set-----------------------");


// it will not allow duplicate value  
//it will allow single null value only 
// it will not maintain any insertion order 
// set ----- hashset  , linkedhashset (maintaing insertion order )

	
	HashSet<String > nameSet = new HashSet<String>()  ;
	     
	nameSet.add("Pooja") ;
	nameSet.add("Pooja") ;
	nameSet.add("Pooja") ;
	nameSet.add("Pooja") ;
	nameSet.add("Lakhan") ;
	nameSet.add("Durga") ;
	nameSet.add("Bhavya") ;
	nameSet.add(null) ;
	nameSet.add(null) ;
	nameSet.add(null) ;
	 
	
	
	
	 for(String s :nameSet ) {
		 System.out.println(s);
	 }

	 System.out.println("==================================================");


  
	 // only difference is that linkedHashset Maintain insertion order only 
	 
	 
	 LinkedHashSet<String > nameLinkedSet = new LinkedHashSet<String>()  ;
	 
	 nameLinkedSet.add("Kunal");
	 nameLinkedSet.add("Kunal");
	 nameLinkedSet.add("Krapa");
	 nameLinkedSet.add("Karn");
	 nameLinkedSet.add("Karn");
	 nameLinkedSet.add("Kundan");
	 
	 nameLinkedSet.add(null);
	 nameLinkedSet.add(null);
	
	 nameLinkedSet.addAll(vectorr) ;
	 nameLinkedSet.addAll(nameSet) ;
		
	 
	// String [] array  = (String[]) nameLinkedSet.toArray();
	 
		 for(String s :nameLinkedSet ) {
			 System.out.println(s);
		 }
	
	
	
	
		 System.out.println("======================TreeSet============================");
		 
		 
		 
		 TreeSet<String> tre  = new TreeSet<String>()  ;
		 
		 tre.add("Zyan") ;
		 tre.add("Xiever");
		 tre.add("Swati") ;
		 tre.add("Abhay") ;
		 
		
		 System.out.println(tre);
		 
		 
		 
		 
		 
		
	}
	
	
	

	
	
	

}
