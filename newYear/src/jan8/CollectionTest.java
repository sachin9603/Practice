package jan8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionTest {

	public static void main(String[] args) {
		
		ArrayList<Integer>  list = new ArrayList<Integer>() ;
		
		list.add(23) ;
		list.add(23) ;
		list.add(3) ;
		list.add(234) ;
		list.add(26) ;
		
		
		System.out.println(list);
		
		//list[0] = 98 ; // can't do this 
		
		LinkedList<Integer> ddd  = new LinkedList<>() ;
		
		ddd.add(23232) ;
		ddd.add(23232) ;
		ddd.add(23232) ;
		ddd.add(23232) ;
		ddd.add(23232) ;
		ddd.add(23232) ;
		System.out.println(ddd);
		
		Vector <Integer> v = new Vector<Integer>() ;
		
		v.add(233434) ;
		v.add(233434) ;
		v.add(233434) ;
		v.add(233434) ;
		
		v.add(233434) ;v.add(233434) ;
		v.add(233434) ;
		v.add(233434) ;
		v.add(233434) ;
		
		System.out.println(v);
		
		
		Stack<Integer > st  = new Stack<Integer>() ; 
		
		st.add(4343) ;
		st.add(44) ;

		st.add(433) ;

		st.add(443) ;

		st.add(433) ;
		System.out.println(st);
		// it has some different method 
		// Last In first out 
		//pop
		System.out.println(st.pop());
		System.out.println(st);
		
		// first in  first out 
		
		/// 1 2 3 4 5 6
		
		Set<String> set  = new HashSet<String>() ;
		
		set.add("Ram") ;
		set.add("Ram") ;

		set.add("rohan") ;

		set.add("sachin") ;
		set.add(null) ;
		
		
		System.out.println(set);
		
		LinkedHashSet  s = new LinkedHashSet<String>() ;
		s.add("sachin") ;
		s.add("sachin") ;

		s.add("pooja") ;

		s.add("roshan") ;
		s.add("roshan") ;
		s.add("roshan") ;

		s.add("lalit") ;
		
		System.out.println(s);
		
		TreeSet tset  = new TreeSet<Integer> () ;
		
		tset.add(23323);
		
		tset.add(2323);
		tset.add(232);
		tset.add(3323);
		tset.add(3);
		tset.addAll(list);
		
		System.out.println(tset.contains(3323));
		
		System.out.println(tset);
		
//	Object sssss [] = tset.toArray() ;
//	
//	Object  sw  = new Student();
	
		
		
		

		
		

		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
