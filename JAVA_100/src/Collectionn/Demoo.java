package Collectionn;

import java.util.*;
import java.util.Vector;


public class Demoo {

	
	

	public static void main(String[] args) {
		///Array  
//		int [] arr = new int[5] ;
//		arr[0] = "sachin" ;
//		
//	
		
//	Vector<String> v  = new Vector()  ;
//	v.add("Sacajin");
//	v.add("poojja");
//	v.add("surya");
//	v.add("kgf");
		
		// collection 
		
		// List(Interface) --- (sequence, duplicacy allow , n null)Arraylist , Linkedlist(Doubly linked list ) , vector (Thread safe , legacy class ko )---->, stack(LIFO) 
		// Queue 
		// set 
	
		
		

		ArrayList<Integer>  list = new ArrayList<>() ;
		
		list.add(000);
		list.add(null);
		list.add(000);
		list.add(56);
		list.add(56);
		
		ArrayList<Integer>  listt = new ArrayList<>() ;
		
		listt.add(456);
		
		listt.add(46);
		listt.add(4);
		listt.add(56);
		listt.add(86);
		
		listt.addAll(list);
		
		listt.remove(0);
		System.out.println(listt);
		
	     //saare loops 
		// for eacth loop 
		
//		for(Integer e :listt) {
//			System.out.println(e);
//		}
		
		Iterator i = listt.iterator();
		
		System.out.println(listt.get(4));
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println(listt.contains(4));
		
		//Linkedlist
		
		/// 100% same hai bahar se 
		
		
		LinkedList<String> li  = new LinkedList<>() ;
		li.add("sachin");
		
		li.add("pk");
		li.add("aryan");
		li.add("rohit");
		li.add("yuvraj");
		
		System.out.println(li);
		
		
		//vector ------ arraylist ()
		
		// thread safe 
		// legacy 
		// slow 
		
		Vector <Integer> dd= new Vector<>()  ;
		dd.add(987) ;
		dd.add(544654) ;
		
		/// stack 
		
		
		Stack<String > st  = new Stack<>()  ;
		
		
		
		
		st.push("Sachin") ;
		st.add("Rohan") ;

		st.add("shivani") ;

		st.add("vikas ") ;

		/// LIFO 
		st.pop() ;
		st.pop() ;
		
		// remove hone vala 
		
		System.out.println(	st.peek());
	
		
		System.out.println(st);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	}
	
	
	
	
}
