package Keyword;

public class Stringgg {
	
	
	// comments  , idetifiers , litral  , oprators  , ++  -- , oops  , static , string 
	public static void main(String[] args) {
		
		Demooo kk = new Demooo()  ; // heap area 
		
		
		String s  = "welcome"; // by literal
		
		s.concat(" anudip"); // it will be same welcome why 
		// you can not change once string is created 
		// scp -- string constant pool and this area is inside into heap 
		
		
		
		

		System.out.println(s);
		
		String s2  = "welcome"; // this welcome will never be created it will take referance from previous welcome
		
		
		
		s = s+" home"; // you are assigning new sting to varible s , then varible to s will get refrence this new sting 
		System.out.println(s);
		
		
		String kks  = new String("welcome"); // this welcome will not save into scp 
		
		
		
		if(s==s2) {
			System.out.println("s==s2 both refrence are same ");
		}
		
		if(s == kks) {
			System.out.println("s==kks both refrence are same ");

		}else {
			System.out.println("s==kks  both refrence are not same ");

		}
		//.equals check value
		
		
		
		
		if(s.equals(kks)) {
			System.out.println("value are same ");
		}
		
		
		
		
		// int short long double char boolean float byte 
		
		// non premeitive data type also -=-- String , Integer 
		
		
		String kkl  = "SAM" ;
		
		
		
		System.out.println(kkl.charAt(2));
	
//	   pp  =    kkl.chars() ;
		
	String sss = "sachin" ;
	String s22  = "Sachin" ;
	
	
	/// agar s22 badi hai toh it will give positive number 
	
	// agar sss chati hai toh negetive value milegi 
	
	int num = s22.compareTo(sss) ; /// yadi s22 chota hai toh negative value shoud 
	System.out.println(num);
	
	
	int nmm = s22.compareToIgnoreCase(sss) ;
	
System.out.println(nmm);
      
      byte []  barry = s22.getBytes() ;
      
  
      
      System.out.println(s22.length());
      
      
      // mutable string can be created by String builder 
      StringBuilder   mp  = new StringBuilder("Sachin")  ;
      
      mp.append("Parmar") ; // mutable string 
      System.out.println(mp );
      
      
      
    // mutable string can be created by StringBuffer ---- Thread safe  
      StringBuffer kll  = new StringBuffer("Kavita ")  ; 
      kll.append(" Rajput") ;
      System.out.println(kll);
      
      
      
      
      // yoou should do 100 
      
      String  kali = "Ramkali" ;// no need to use in--built method
      String ll = "";
      /// ilakmaR
      int len  = kali.length() ; // 7
      
      
      for(int k  = len-1  ; k>=0 ;k--) {
    	 ll = ll+kali.charAt(k)  ;
    	 
      }
      
      System.out.println(ll);
      
      
      
      
      
      
      
      
      
      
      
      


	
	
	
	
		
				
		
		
	}
	

}
