package Collection__;

import java.util.*;

public class Demo {
	
	///
	
	// kaam -- bulk object  store karna hai 
	
	// 10 student student ka data store karna ahai 
	
	
	public static void main(String[] args) {
		Student [] arr  = new Student[6] ;
		
		arr[0] = new Student(10  , "Pihu" , "MAth") ;
		arr[1] = new Student(10  , "satlj" , "MAth") ;
		arr[2] = new Student(10  , "Gyaansing" , "MAth") ;
		arr[3] = new Student(10  , "Ramsing" , "MAth") ;
		arr[4] = new Student(10  , "Pansing" , "MAth") ;
		arr[5] = new Student(10  , "Devkarna" , "MAth") ;
		
		
		

		System.out.println(Arrays.toString(arr));
		
		/// array mai --- no facility to remove duplicate 
		///               size of array is restricted , size should be dynamic 
		  //              no other method to perform operations 
		// 
		
		// Angular bracket ko bolte hai genric 
		// they are used of type saftey  
		

		 ArrayList<String> lisst1  = new ArrayList<> ()   ;
		 lisst1.add("Lakhan ") ;
		 lisst1.add("Lakhan") ;

		 lisst1.add("Lakhan") ;

		 lisst1.add("Lakhan") ;
		 
		 ArrayList<String> lisst  = new ArrayList<> ()   ;
		 lisst.add("sachin") ;
		 lisst.add("sachin") ;

		 lisst.add("sachin") ;

		 lisst.add("sachin") ;

		 lisst.add("sachin") ;
		 lisst.add(null) ;
		 lisst.add(null) ;
		 lisst.add(null) ;
		 

		 lisst.add("vivek ") ;

		 
		 lisst.add("vivek ") ;

		 lisst.add("pooja") ;
		 
		 lisst.addAll(lisst1) ;
		 
		 
		// lisst.clear();
		 System.out.println(lisst);
		 
		 
		 for (int i = 0 ;i<lisst.size()  ;i++ ) {
			 System.out.println(lisst.get(i));
		 }

		 
		 System.out.println(lisst.contains("pooja"));
		 
		 
		 
		  ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
          list.add("John");//Adding object in arraylist    
          list.add("Peter");    
          list.add("Lucy");    
          list.add("Johnson");    
          //Traversing list through Iterator    
        
          Iterator itr = list.iterator() ;
          
          while(itr.hasNext()) {
        	  System.out.println(itr.next());
          }
          
          
          System.out.println("=================================");
		
          
          
          LinkedList<String> al=new LinkedList<String>();    
          al.add("Lucy");    
          al.add("Peter");    
          al.add("sachin");    
          al.add("John");    
          
          for ( int i=0 ;i<al.size()  ;i++) {
        	  System.out.println(al.get(i));
          }
	}
	
	
	

}
