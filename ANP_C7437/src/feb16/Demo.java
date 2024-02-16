package feb16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ArrayList list = new ArrayList<>() ;
//		
//		list.add(212323) ;
//		
//		list .add("Sachin") ;
//		
//		list.add(true) ;
//		
//		list.add('c') ;
//		
//		System.out.println(list);
//		
//		
//		int arr[]  
		
		Address a1  = new Address() ;
		a1.setCity("Indore");
		a1.setPincode("456211");
		a1.setState("MP");
		
		Student s1 = new Student() ; // default cont use ho rha hai 
		
		s1.setName("Raju" );
		s1.setId(12123);
		s1.setAddress(a1);
		
		s1.setAddress(a1);
		
		
		
 Student s2 = new Student("Mahima", 456 , new Address("543245" , "Bhoapal" , "mp"));
 Student s3 = new Student("puja", 456 , new Address("543245" , "Bhoapal" , "mp"));

 
 Student sjjjj = new Student("Matrix", 456 , new Address("543245" , "Bhoapal" , "mp"));

 s3.getAddress().setCity("Mumbai");
 
 
 //a1.setCity(");
 
 Student s4 = new Student("rita", 456 ,a1);

//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.print(s3);
//		System.out.print(s4);
		
//	  Student [] arrOFStudent  = new Student[8] ;
//	  arrOFStudent[0] = s1 ;
//	  arrOFStudent[1] = s2 ;
//	  arrOFStudent[2] = s3 ;
//	  
//	  for(Student ss  :arrOFStudent ) {
//		  System.out.println(ss);
//	  }
//	  
//		
//		int [] aa = new int [8] ;
		
		List<Student> shortlist  = new ArrayList<> () ;
		shortlist.add(s4) ;
		shortlist.add(s1) ;
	   
		
		List<Student>  list  = new ArrayList<>() ;
		
	   //boolean  dataInserted   = list.addAll(shortlist) ;
		list.add(s4) ;
		list.add(s3) ;
		list.add(s2) ;
		list.add(s1) ;
		
		list.add(2, sjjjj);
		
		
		
		System.out.println("-------------arrayList ka data --------");
		//System.out.println(list);
//		
//		list.remove(sjjjj) ;
//		list.removeAll(shortlist) ;
		
	    System.out.println(list.contains(sjjjj));
		
		System.out.println(list.size());
		
		for (Student aass  : list) {
			
			System.out.println("777777");
			aass.getAddress().setCity(null) ;
			System.out.println(aass);
			
		
		}
		
		LinkedList <Integer> linklist  = new LinkedList<>() ;
		
		// 100 percent same hai arraylist k  jesa  but internaly agal tareek 
		//se save ho rha hai data 
		
		linklist.add(12) ;
		linklist.add(2) ;
		linklist.add(19) ;
		linklist.add(98) ;
		linklist.add(77) ;
		
		
		System.out.println(linklist);
		// more than one thread can't work on vector 
		//synchronized 
		
		
		Vector<String>  vc  = new Vector<>(); 
		
		vc.add("sachin") ;
		vc.add("ajj") ;
		vc.add("rajiu") ;
		vc.add("jivan ") ;
		vc.remove(3) ;
		
		System.out.println(vc);
		
		
		//LIFO // jo last mai aaya hai vahi pehle jaayaga
		
		// 
     Stack<Integer>  st  = new Stack<>() ;
     
    
     st.add(23) ;
     st.add(33) ;
     st.add(65) ;
     st.add(886) ;
     st.add(966) ;
     
     st.pop() ;
     st.pop() ;
     st.pop() ;
     System.out.println(st.peek());
     
     System.out.println(st);
     
 
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
