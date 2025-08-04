package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Demo {
	
	public static void main(String[] args) {
		
		
		int [] arr = new int [5] ;
		// it is static in size 
		
		// it is type safe 
	//	arr[3] = "Sachin" ;
		
		// it is not providing method also 
		
		
		
		Student [] stArr  = new Student[100] ;
		
	
		
		ArrayList ll  = new ArrayList<Integer>() ;
		
		ll.add(12) ;
		// ll.add("pushpa");
		
		ll.add(1212) ;
		
		ll.add(9090) ;
		
		
		System.out.println(ll);
	
		ArrayList list  = new ArrayList<>() ;
		list.add("Sachin") ;
		list.add("swati") ;
		list.add("shubma ") ;
		list.add("renu") ;
		list.add(12) ;
		list.add(true) ;
		list.add(null)  ;
		list.add(null) ;
		list.add(null) ;
		
		
		
		
		
		list.addAll(ll) ;
		System.out.println(list);
		
		list.remove("shubma ");
		
		
		System.out.println(list);

		
		if(list.contains(9090)) {
			System.out.println("yes yes ");
		}
		
		
		
		
		
		
		LinkedList <Integer>  lst = new LinkedList() ;
		
		lst.add(990) ;
		lst.add(2132) ;
		lst.add(2322) ;
		lst.add(12121) ;
		
		System.out.println(lst);
		
		
		// vector is same as arraylist but it belongs to lagacy class 
		// and it is thread safe
		
		
		
		// it is coming from  legacy class 
		//
		Stack<Integer> st  = new Stack<> ()  ;// LIFO last in first out 
		
		st.add(1212);
		
		
		st.add(23);
		
		st.add(453);
		
		st.add(534);
		
		st.add(232);
		
		st.add(23223);
		st.push(2323232) ;
		System.out.println(st);
		
		st.pop() ;
		st.pop() ;
		System.out.println(st);
		int s  =st.peek() ; // 232
		
		System.out.println(s);
		st.peek()  ;
		
		System.out.println(st);
		// push  // data akhri mai add karna 
		
		//pop  last se data niklana 
		
		//peek  last data show karna 
		
		
		
		
		
		
		
		
		
	}

}
