package sep6.collectionn;

import java.util.ArrayList;
import java.util.Stack;
import java.util.*;

public class Basic {
	
	
	// 2-d how to input into 2d array by user 
	// then differnt method to explore and traverese this 2d  like N spiral traversal
	
	// internal working of array list 
	// difference between array and array list 
	
	
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("Ravi");//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");  

		System.out.println(list);
		
		// vector  
		
		
		
		//it belongs to legacy class 
		// it is synchronised (), not multithreaded  , thread saftey
		Vector<String>  vecto  = new Vector<>() ;
		vecto.add("pooja") ;
		vecto.add("Rakhi") ;
		vecto.add("pooja") ;
		vecto.add("sunil") ;
		vecto.add(null) ;
		vecto.add(null) ;
//		HashTable <key value >
//		Stack 
//		Dictionary
//		Properties
//		Vector
		
		System.out.println(vecto);
		
		// stack implemntation using array in java 
		
		///stack follow lifo (lst in first out )
		Stack<String> stack = new Stack<String>();  
		stack.add("hariom");
		stack.push("Ayush");   // data add karna 
		stack.push("Garvit");  
		stack.push("Amit");  
		stack.push("Ashish");  
		stack.push("Garima"); 
		//System.out.println(stack.pop();
		stack.pop();// last se ddata remove karti hai 
		
		System.out.println(stack.peek() );
		; // jo last mai us dtaa ko bata degi  // jo remove hone vala hai 
		
		System.out.println(stack
				);
		
		
		LinkedList<String> al=new LinkedList<String>();  
		
		al.add("Ravi");  
		al.add("Vijay");  
		al.add("Ravi");  
		al.add("Ajay"); 
		al.remove("Vijay");
		
		System.out.println(al);
		
		
		
		//Creating HashSet and adding elements  
		Set<String> set=new HashSet<String>();  
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay");  
		set.add(null);  
		
		set.add(null);  
		set.add("Ajay");  
		
		
		System.out.println(set);
		
		
		
		
		LinkedHashSet<String> sset=new LinkedHashSet<String>();  
		sset.add("pavitra  swati");
		sset.add("Ravi");  
		sset.add("Vijay");  
		sset.add("Ravi");  
		sset.add("Ajay");  
		sset.add(null);  
		
		sset.add(null);  
		
		System.out.println(sset);
		
		
		
		
		TreeSet<String> sett=new TreeSet<String>();  
		sett.add("Ravi");  
		sett.add("Vijay");  
		sett.add("Ravi");  
		sett.add("Ajay");  
		sett.add(null); 
		sett.add("Ajay"); 
		
		//traversing elements  
		
		
		System.out.println(sett);
		
		
		
		
		
	}
	
		//Traversing list through Iterator  
	

}
