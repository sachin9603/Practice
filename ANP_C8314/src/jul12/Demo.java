package jul12;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class Demo {
	
	
   public static void main(String[] args) {
	
	   
	   
	   
	   
	   Stack<Integer>  st  =  new Stack () ;
	   
	   st.add(12) ;
	   st.add(912) ;
	   st.add(712) ;
	   st.add(612) ;
	   st.add(512) ;// last in first out 
	   
	   st.peek() ; // jo data nikalne vala hai vo show hota hai 
	   
	   
	   
	   st.pop() ; // last 512  will be removed 
	   st.pop() ; 
	   
//	   for ( int  i =0  ;i<st.size()  ; i++) {
//		   System.out.println(st.get(i));
//	   }
	   
	   
	   
	   Iterator itr=st.iterator(); 
	   
	   while(itr.hasNext()) {
		   System.out.println(itr.next());
		   
		   itr.remove();
	   }
	   
	   Enumeration e=st.elements();  
	   while(e.hasMoreElements()){  
		   
	    System.out.println(e.nextElement());  
	    
	   }  

	   
	   
	  
	   LinkedList<String> list  = new LinkedList<>() ;
	   list.add("sanjay") ;
	   
	   list.add("reena");
	   list.add("suraj") ;
	   
	   
	   
	   
	   
	   Iterator itrr=list.iterator(); 
	   
	   while(itrr.hasNext()) {
		   System.out.println(itrr.next());
		   
		  
	   }
	   
	   for ( int  i =0  ;i<list.size()  ; i++) {
		   System.out.println(list.get(i));
	   }
	  
	   
	   
	   
   }

}
