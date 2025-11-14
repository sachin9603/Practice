package Collection__;

import java.util.*;

public class Arraylist_Demo {
	
	// List ----Arraylist, linkedlist  , vector , stack 
//	
//	Question 1: Store Student Names
//
//	Create a program using ArrayList<String>.
//
//	Requirements:
//
//	1. Create an ArrayList to store student names
//
//
//	2. Add at least 7 names
//
//
//	3. Print all names
//
//
//	4. Print the total number of students
//	5. Print the 2nd and last student name
//	6.
	
	public static void main(String[] args) {
		
		ArrayList<String> list  = new ArrayList<>()  ;
		
		list.add("sachin");
		list.add("sherya");

		list.add("pinki");

		list.add("pooja");

		list.add("vaibhav");

		list.add("Bhavesh");
		list.add("aman");
		
		
		for(int i =0 ;i<list.size()  ;i++) {
			
			System.out.println(list.get(i));
		}
		System.out.println(list.size());
		
		System.out.println(list.get(1));
		System.out.println(list.get(list.size()-1));
//
//		
//		Create a program using ArrayList<Integer>.
//
//		Requirements:
//
//		1. Add marks of 10 students
//
//
//		2. Print all marks
//
//
//		3. Find and print the highest mark
//
//
//		4. Find and print the lowest mark
//
//
//		5. Print the average marks
//		
		
		ArrayList<Integer> li   = new ArrayList<Integer> ()  ;
		li.add(56) ;
		li.add(58) ;
		li.add(89) ;
		li.add(85) ;
		li.add(36) ;
		li.add(74) ;
		li.add(72) ;
		li.add(78) ;
		li.add(76) ;
		li.add(93) ;
		
		int highest = li.get(0);
		int lowes  = li.get(0) ;
		int sum = 0;
		for (int i =0 ;i<li.size() ;i++) {
			if(li.get(i)> highest) {
				highest = li.get(i) ;
				
			}
			
			if(li.get(i)<lowes) {
				lowes = li.get(i) ;
				
			}
			
			sum = sum + li.get(i) ;
		}
		
		System.out.println("high " + highest);
		
		System.out.println("low " + lowes);
		
		System.out.println("Avg " + sum/li.size());

		
		// from user perspective it is same as arraylist 
		// but internal working is different 
		// it store data in from of node 
		
		// every node is object wchich have two things 1 st is data 
		/// 2nd addesss of next node 
		// sequence  , n number of null value 
		// it is better in deletion and updation of data 
		
		 LinkedList<String> al=new LinkedList<String>();    
	        al.add("Lucy");    
	        al.add("Peter");    
	        al.add("Lucy");    
	        al.add("John");    
		
	        System.out.println(al.get(2));
	        
	        
	        // pura same hai arraylist ki tarah lekin ye 
	        // ye legacy class ko belong karta hai 
	        /// synchonized (Thread safe) -- slow 
	        Vector<String> v=new Vector<String>();    
	        v.add("Apple");    
	        v.add("Banana");    
	        v.add("Orange");    
	        v.add("Plum");    
	        
	        
	        System.out.println(v);
	        
	        
	        //Stack-== pura same hai arraylist 
	        // diff ---- legacy class ko belong karta hai 
	         //// thread safe 
	        /// it extends Vector 
	        // LIFO--- last mai jo data aaya hai vo remove pehle 
	        
	        Stack<String> stack = new Stack<String>();    
	        stack.add("CPU");    
	        stack.push("Monitor");    
	        stack.push("Mouse");    
	        stack.push("Keyboard");    
	        stack.push("Printer");  
	        
	       System.out.println(stack); 
	       
	       stack.pop();
	       stack.pop();
	       stack.pop();
	       
	       System.out.println(stack.peek() );
	       
	       System.out.println(stack);
	       
	        ;
	       
	        
	        ///Set Interface ----- HashSet , LinkedHashSet ,TreeSet
 
	        // no duplicacy 
	        // no more than one null value 
	        
	        
	        /// no insertion order 
	        // internal working of hash set 
	        HashSet<String> set=new HashSet<String>();    
	        set.add("Andrew");    
	        set.add("Mark");    
	        set.add("Peter");    
	        set.add("Johnson");  
	        set.add("Peter");    
	        set.add("Johnson");
	        set.add(null);
	        set.add(null);
	        set.add(null);
	        set.add(null);
	        
	        
	        System.out.println(set);
	        
	        
	        /// only diff ye hai ki ye insertion order maintain karta hai 
	        
	        
	        LinkedHashSet<String> setset=new LinkedHashSet<String>();    
	        setset.add("Peter");    
	        setset.add("Jack");    
	        setset.add("Peter");    
	        setset.add("Johnson");   	        
	        
	        setset.add("Peter");    
	        setset.add("Jack");    
	        setset.add("Peter");    
	        setset.add("Johnson");   	        
	        
	        setset.add(null);
	        setset.add(null);

	        System.out.println(setset);
	        
	        
	        
	        //TreeSet  -- same but it will no any value ,, aumatic assending mai mai aapko chije degaaa
	        TreeSet<String> se=new TreeSet<String>();    
	        se.add("Thomas");    
	         se.add("Davis");    
	         se.add("Thomas");    
	         se.add("Donald"); 
	         
	        
	         
	         System.out.println(se);
	        
	        
//		
	}

}
