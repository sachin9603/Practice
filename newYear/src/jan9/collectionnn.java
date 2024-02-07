package jan9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeSet;

public class collectionnn {
	
	public static void main(String[] args) {
		/// iterable ----->>collection ---> list  ----->>>ArrayList ,LinkedList, Stack, Vector ,,
		                           // ---- > queue 
		                            // -----> set 
		
//		ArrayList arrlist  =  new ArrayList() ;
//		arrlist.add(12121) ;
//		arrlist.add("Sachin") ;
//        arrlist.add('c') ;
//        arrlist.add(true) ;
//        System.out.println(arrlist);
        
		Stack<Integer> st  =  new Stack<Integer>() ;
		
		st.add(2323) ;
		st.add(23) ;
		st.add(27) ;
		st.add(7) ;
		st.add(788) ;
		st.add(2777);
		st.push(12341234);
		
		
		
		//System.out.println(arrlist);
		
		// initial size of aarray list  = 10  ;
		// .75 is load factor 
		// how much size increase after reaching to the loadfactor  ----- arraylist size will increase  50%
		
		System.out.println(st.size());
		
		System.out.println(st.peek() );
//		System.out.println(st.pop());
//		System.out.println(st.pop());
//		System.out.println(st.pop());
//		System.out.println(st.pop());
		System.out.println(st.remove(0));
		
		System.out.println(st.removeElement(788));
		System.out.println();
		//st.clear();
		System.out.println(st);
		
		///peek - it will show u last value  
		//// pop  ---  it will show and remove it also 
		
		
	// array  , arralist  , linkedlist  , vector  , stack 
		
		ArrayList<Integer> ll  = new ArrayList<Integer>() ;
		ll.add(999) ;
		
		ll.add(999) ;
		
		ll.add(999) ;
		
		ll.add(999) ;
	
		ll.addAll(2, st);
		
		System.out.println(ll);
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>() ;
		
		pq.add(23);
		pq.add(34);
		pq.add(34);
		pq.add(34);
		pq.add(34);
		pq.add(8);
		pq.add(9);
		
		System.out.println(pq);

		//pq.remove();  
		pq.remove();
		System.out.println(pq);
		
		
		
		
		
		TreeSet set  = new TreeSet();
		
//		set.add("sachin") ;
//		set.add("sachin") ;
//		set.add("rahul") ;
//		set.add("kailash") ;
//		set.add("kailash") ;
		set.add(12);
		set.add(2);
		set.add(18);
		set.add(9);
		
		
		System.out.println(set);
		
		
		
		
		
		
		
		
		
		
		
		
		
System.out.println("-----------------------------------------------------------------------------------------");
		
		for (Integer oo:ll) {
			
			System.out.println(oo);
			
		}
		
		
		
		
		
	}
	

}
