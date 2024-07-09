package jul8;

import java.util.*;

public class Demo {
	
	
	public static void main(String[] args) {
		            //  = new Integer[15] ;
		              
		int []arr   = {12,44,21,61,91} ;
	arr[0] = 44 ;
	
	//	arr[10] = 89 ;
		
		                      
		ArrayList<Integer>  arrayList = new ArrayList<Integer> () ;
		                               
		System.out.println(arrayList.size());
		                               
		arrayList.add(12) ;
		arrayList.add(1232) ;
		arrayList.add(11332) ;
		
		arrayList.add(1122) ;
		arrayList.add(12322) ;
		arrayList.add(1212) ;
		arrayList.add(1232) ;
		arrayList.add(12312) ;
		arrayList.add(15432) ;
		arrayList.add(12312) ;
		arrayList.add(12121) ;
		
		
		
		
		int len  =  arrayList.size() ;
		
		System.out.println(len);
		
		
		for ( int i =0  ;i<len  ;  i++ ) {
			
			System.out.println(arrayList.get(i));
			
		}
		
		
		ArrayList<String> array = new ArrayList<>() ;//{ , , }
		
		array.add("Roshn") ;//0
		array.add("RAkhi") ; //1
		array.add("Poonam") ;
		array.add("Pooja") ;
		array.add("Jaspreet") ;
		array.add("Anudip") ;
		array.add("Lokesh") ;// 6
		
		
		
		array.remove(0) ;
		array.remove("Jaspreet") ;

		
		

		
	for ( int i =0  ;i<array.size()  ;  i++ ) {
				
				System.out.println(array.get(i));
				
			}
	// question  you need to create a arraylist of string 
		// then add 10 Random String then traverse then remove
		//String at particular index
		// then  traverse
	
	
	Vector<String> ppp  = new  Vector<> ();
	
	
	ppp.add("Banana");
	
	ppp.add("papaya");

	ppp.add("Guvava");

	ppp.add("Lichi");
	
	
	
	ppp.addAll(array);
	
	System.out.println("////////////////////////////////////");
	
	for(String oioi:ppp) {
		System.out.println(oioi);
	}
			
	
		
		
		
		
		
		
	Stack <String> st  = new Stack<String> ();
	
	st.add("math");
	st.add("hindi");
	st.add("so. study");
	st.add("physics") ;
	
	
	st.pop();// 
	System.out.println(st.peek());
	st.pop();
	st.push(null);
	st.push(null);
	st.push(null);
	
	
	System.out.println(st);
	
	
		
		
		
	}

}
