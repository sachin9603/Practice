package feb7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class Normal {
	
	
	public static void main(String[] args) {
		
		// group of obj ko store kane ki jagah 
		
		int [] arr  = new int[5] ;
		arr[0] = 45  ;
		arr[1] = 45456  ;
		arr[2] = 45465  ;
		arr[3] = 475  ;
		
	
		
		
		
		
		
		
		
		
		
		// i want a list of student 
		
		Student[]  studentArr  = new Student [5] ;
		
		int s  = studentArr.length ;
		
		
		studentArr[0] = new Student(667  , "rahul" , "nri");
		
		
		studentArr[1] = new Student(617  , "kit" , "nri");
		studentArr[2] = new Student(267  , "super rajiv" , "nri");
		studentArr[3] = new Student(647  , "kunal " , "nri");
		
		studentArr[4] = new Student(667  , "priya " , "nri");
		
		
	//	studentArr[5] = new Student(667777  , "priya " , "nri");
		
		
		
		for (Student  st  :studentArr) {
			System.out.println(st);
		}
		   
		// i have facility to store multiple obj into an array
		
		
	///	then why collection 
		//problems in array  ,,, you have to decided the size of arr inititally 
		// i have to store only one kind of data 
		
		
		
		List <Integer> list  = new Vector<>() ;
		
		list.add(12) ;
		list.add(1212) ;
		
		list.add(145652) ;
		list.add(17842) ;
		list.add(121231) ;
		
		
        List <Integer> list2  = new LinkedList<>(list) ;
		
		list2.add(77777777) ;
		list2.add(1212) ;
		
		list2.add(145652) ;
		list2.add(17842) ;
		list2.add(121231) ;
		
		
		//list2.clear();
		
		list2.remove(5) ;
		
		//list2.removeAll(list) ;
		
		
		
		
		
		for( int  i =0  ;i<list2.size() ;i++) {
			
			System.out.println(list2.get(i));
		}
		
		
		
		// array list par do thread kaam karstkte hyai 
		// but vector par nahi 
		
		System.out.println("mai hu stack ");
		
		Stack st = new Stack <>() ;
		
		st.add(888) ;
		st.add(2) ;
		st.add(5) ;
		st.add(7) ;
		st.push(5544545) ;
		
		
        //st.pop() ;
		//st.pop() ;
		System.out.println(st.peek());
		
		
for( int  i =0  ;i<st.size() ;i++) {
			
			System.out.println(st.get(i));
		}
		
		
		
		
	
		
		
		System.out.println("mai hu setttttt");
		
		
		Set <Integer> tst = new HashSet<>() ;

		tst.add(12) ;
		tst.add(14) ;
		tst.add(46) ;
		tst.add(86) ;
		tst.add(6) ;
		
		tst.add(null) ;
		tst.add(null) ;
		tst.add(null) ;
		tst.add(null) ;

		tst.add(12) ;

		tst.add(12) ;

	    for (Integer uu  : tst) {
	    	System.out.println(uu);
	    }
		
		
	    
	    System.out.println(" mai hu linked hasset ");
	    
//	    
	    LinkedHashSet  <Integer>ss  = new LinkedHashSet<>() ;
	    
	    ss.add(33) ;
	    ss.add(1) ;
	    ss.add(35) ;
	    
	    ss.add(6) ;
	    ss.add(8) ;
	    ss.add(2) ;
	    ss.add(9) ;
	    ss.add(12) ;
	    
	    
	    
	    for (Integer uu  : ss) {
	    	System.out.println(uu);
	    }
	    
//		
	    
	    
	    System.out.println(" mai hu treee set");
	    
 TreeSet  <Integer>sss  = new TreeSet<>() ;
	    
	    sss.add(33) ;
	    sss.add(1) ;
	    sss.add(35) ;
	    
	    sss.add(6) ;
	    sss.add(8) ;
	    sss.add(2) ;
	    sss.add(9) ;
	    sss.add(12) ;
	    
	    
	    
	    for (Integer uu  : sss) {
	    	System.out.println(uu);
	    }
	    
		
		
		
	    Object[] ariiir = sss.toArray() ;
	    
	   
	   boolean b =   sss.contains(89999) ;
	   
	   System.out.println(b);
	   
	   
 	   List <Integer> ii  = new ArrayList<>() ;
 	   ii.add(232) ;
 	   ii.add(2334) ;
 	  ii.add(24) ;
 	 ii.add(4) ;
 	 ii.add(8) ;
 	 ii.add(null) ;
 	 ii.add(null) ;
 	 ii.add(null) ;
 	 
 	// ii.add("Aschin") ;
 	 
 	 
 	 int[] arrrtr  = new int [2] ;
 	 
 	   
 	 
 	 for (Integer qq :ii) {
 		 System.out.println(qq);
 	 }
 	   
		
 	 
 	 System.out.println("=======================");
 	 
 	 LinkedList <Integer>  ledlist = new LinkedList<>() ;
 	ledlist.add(2323) ; // jab ye save ho raha hai tab do chije save hoogi phle ye kuch cvalue and second hai vo aagli valye ka address 
 	ledlist.add(3) ;
 	ledlist.add(6) ; // 6 k baad 12 
 	ledlist.add(7) ;
 	ledlist.add(8) ;
 	System.out.println(ledlist);
 	for(Integer kk :ledlist) {
 		System.out.println(kk);
 	}
 	
 	
 	
// 	Sachin :85 
// 	punam  :33 
// 	
// 	akshay :85
// 	null :
//   asdasdf: null 
//   sdfasdff:null
   
 	
  	
 	
 	Map<String , Integer > mp  = new LinkedHashMap<>() ;
 	//mp.add("345324543" ,234543) ;
 	
 	mp.put("sachin" , 35) ;
 	
 	mp.put("vikas " ,56) ;
 	mp.put("raha " ,56666) ;
 	mp.put("paneer " ,536) ;
 	mp.put("tejas " ,546) ;
 	mp.put("surbhi " ,5766) ;
 	mp.put("akshy " ,5986) ;  
 	

 	//  Set se=mp.entrySet();
 	
 	for ( Map.Entry<String, Integer> e:mp.entrySet()) {
 		System.out.println(e.getKey() +" " + e.getValue());
 		
 	}
	
	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	 
 	 
 	 
		
		
	}

}
