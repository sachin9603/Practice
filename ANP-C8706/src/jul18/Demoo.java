package jul18;

import java.util.*;
import java.util.Iterator;

public class Demoo  {
	
	
	
	

	@Override // it means toString is available in some parent class
	public String toString() {
		return "Demoo [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public static void main(String[] args) {
		
//		ArrayList list = new ArrayList() ;
//		
//		list.add(true) ; 
//		
//		list.add("String") ;
//		
//		list.add(121212) ;
//		list.add(1212121.00) ;
//		
//		System.out.println(list);
//		
//		System.out.println(list.get(1));
		
		
		
		ArrayList<String>  li  = new ArrayList<>() ;
		
		li.add("Faruk") ;
		li.add("Rashi") ;
		li.add("Gopi") ;
		li.add("Aham") ;
		li.add("Kokila") ;
		
		
ArrayList<String>  lii  = new ArrayList<>() ;
lii.add("Satish") ;
lii.addAll(li);
		

lii.add("Arayman") ;
lii.add("Deepak") ;
lii.add("Pinjara") ;
lii.add("Rishabh") ;
		

		
		System.out.println(lii.size());
		
		System.out.println(lii.contains("Gopi"));
		
		System.out.println(lii.remove(4));
		System.out.println(lii);
		
		Iterator itr=lii.iterator();  
		while(itr.hasNext()){
			
		System.out.println(itr.next());
		
		}  
		
		
		
		LinkedList<String> al=new LinkedList<String>();  
		al.add("Ravi");  
		al.add("Vijay");  
		al.add("Ravi");  
		al.add("Ajay");  
		System.out.println(al.get(2));
	
		
		Vector<String> all=new Vector<String>();  
		
		all.add("Ravi");  
		all.add("Vijay");  
		all.add("Hariom");  
		all.add("Ajay");  
		System.out.println(all.get(2));
		
		Stack<Integer>  st  = new Stack<>() ;
		
		
		st.add(12) ;
		st.add(65) ;
		st.add(88) ;
		st.add(1233) ;
		st.push(999) ;
		st.push(9 );
		st.push(909) ;
		st.push(977) ;
		
		//st.remove() ;
		st.peek();
		st.peek();
		st.peek();
		
		System.out.println(st);
		
		st.pop();
		st.pop();
		System.out.println(st.peek());
		st.pop();
		
		System.out.println(st.peek());
		
		
		System.out.println(st);
		
		
		
		System.out.println("///////////////////////////");
		
		
		HashSet<String> set=new HashSet<String>(); 
		
		set.add("Ravi");  
		set.add("Ravi");  
		set.add("Ravi");  
		set.add("Ajay"); 
		
		set.add("Sachin") ;
		set.add("Anju") ;
		set.add("priatm") ;
		set.add(null) ;
		
		
		// no duplicate 
		// sigle null  
		// no insersation order
		System.out.println(set);
		
		
		
		System.out.println("LinkedHashSet");
		

		LinkedHashSet<String> sset=new LinkedHashSet<String>(); 
		
		sset.add("Ravi");  
		sset.add("Ravi");  
		sset.add("Ravi");  
		sset.add("Ajay"); 
		
		sset.add("Sachin") ;
		sset.add("Anju") ;
		sset.add("priatm") ;
		sset.add(null) ;
		System.out.println(sset);
		
		
		System.out.println("tree set ");
		TreeSet<String> ssset=new TreeSet<String>(); 
		
		ssset.add("Ravi");  
		ssset.add("Ravi");  
		ssset.add("Ravi");  
		ssset.add("Ajay"); 
	
		ssset.add("Sachin") ;
		ssset.add("Anju") ;
		ssset.add("priatm") ;
		
		// no dup;ication 
		// no null  
		// ascending order 
		
		
		
		System.out.println(ssset);
		
		
		
		
		
		
	}
}
