package jan2;

import java.util.Arrays;

public class StringString {
	
	
	public static void main(String[] args) {
		// .equals() value  compare karata hai 
		// == object compare karta hai 
		
		
		//you can create strings 
		
		// by literal
		
		String s  = "welcome" ;// strings are immutable 
		s = "welcome home"  ;//
		System.out.println(s);
		
		String e  = "welcome" ;// string pool area mai jakar 
		// using new keyword  
		String s1 = new String("welcome") ;
		s1= " welcome home"; 
		String e1 = new String("welcome") ;
		
		Integer  a  = 10 ;
		
		
		char [] arrr  = {'a','b' ,'c' , 'd'} ;
		
		String arrKaString = new String(arrr) ;
		System.out.println(arrKaString);
		
		char ch = arrKaString.charAt(1) ;
		System.out.println(ch);
		System.out.println(arrKaString.length());
		
		arrKaString  = arrKaString.concat("efgh" ) ;
		
		System.out.println(arrKaString);
		String newarrKaString = arrKaString.replace('a', 'q') ;
		
		System.out.println(newarrKaString);
		
		
		String aa = "aahhhbbc" ;
		
		char [] aaarr =  aa.toCharArray();
		
		
		aaarr[3] = 'z' ;
		
		String ssaa = new String (aaarr);
		
		System.out.println(ssaa);
		
		// welcome , WElCome
		
		String e5  = "weLcOme" ;
		
		if(e.equalsIgnoreCase(e5)) {
			System.out.println(true);
		}
		// reverse k do trike k  question  
		
		 /// "vaja si ym vaf egaugnal"
		//language fav my is java 
		
		String www  = "      java is my fav language               " ;
		//www = www.trim() ;
		String WWW  = www.toUpperCase() ;
		System.out.println(WWW);
		
		String [] ss  = www.split(" ");
		System.out.println(ss.length);
		
		
		//System.out.println(Arrays.toString(ss));
		int count  = 0  ;
		
		for(String eee : ss) {
			System.out.println(eee);
			count++ ;
			
		}
		
		System.out.println(count);
		
		
		

		
				
	
//		if ( s == s1) {
//			System.out.println(" s == s1");
//		}else {
//			System.out.println(" it not true " );
//		}
//		
//		
//		if (s.equals(s1)) {
//			System.out.println(" s.equals(s1)");
//		}
//		
//		if(s == e) {
//			System.out.println("s == e");
//		}
//		
//		if (s.equals(e)) {
//			System.out.println(" s.equals(e)");
//		}
//		
//		if(s1 == e1) { // no 
//			System.out.println("s1 == e1");
//		}else {
//			System.out.println("s1 ==  not equal e1");
//		}
		
//		if (s1.equals(e1)) {
//			System.out.println(" s1.equals(e1)");
//		}
//		
//		"500"
		
		int gg  = 500 ;
		gg = gg+100 ;
		
		String pp = "sachin"+10+20 +""+30 ;
		System.out.println(pp);
		
		
		
		String ggg = String.valueOf(gg) ;
		System.out.println(ggg instanceof String );
		System.out.println(ggg + 100 );
		
		/// sageUniversityStudent
		// egas
		
		String iu = "sage University Students are good" ;
		//egas ytisrevinU
		String iuArr[]  = iu.split(" ");
		
	System.out.println(Arrays.toString(iuArr));
		
		//String newreverse = "" ;
		for (int j = 0 ;j< iuArr.length ;j++ ) {
			String  reverse  = "" ;
			int length   =  iuArr[j].length();// 4
			for ( int i = length-1 ; i>=0 ; i-- ) {
				reverse +=  iuArr[j].charAt(i) ;
			}
			System.out.print(reverse+" ") ;
		}
		
		
//		
//		
//		int length   =  iu.length();
//		
//		String  reverse  = "" ;
//		
//		
//		for ( int i = length-1 ; i>=0 ; i-- ) {
//			reverse +=  iu.charAt(i) ;
//			
//		}
//		System.out.println(	 reverse) ;
//
//		
		
		
		
		
		
		
		
//		String s  = new String("sachin") ;
//		s = s +" parmar" ;
		
	 //	sachin  ---- all substring create karna hai 
		 // 7*3
		//s 
		//sa , sac sach sachi 
		//sachin a ac ach achi
		//achin c ch chi chin h hi hin i in n 
		//anjali a an anj anja anjal anjali 
		
		
		
		
	}

}
