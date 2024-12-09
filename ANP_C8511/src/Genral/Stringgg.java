package Genral;

public class Stringgg {
	
       String name    = "sachin";
       Direction direction ;
       Size ss ;
       
       
	
	
	
	
	
	
	

	public static void main(String[] args) {
		
		
		String s  = "welcome" ; //scp
		
		String p  = "welcome" ; // scp
		
		String l  = new String("welcome hai heap k ander ") ; // heap area
		
		String  oo  =  l.intern() ; //scp 
		
		
		///  There is heap area in which every object is getting storeed 
		
		// so for string there is( String constant pool) area inside heap memeory
		// all strings are getting stored which are created by only literals 
		
		// suppose 
		// s welcome banaya toh ek welcome 
		// but when i created p again so jvm will check in scp area is there is 
		// "welcome" present, and if welcome is there so it will not create a new welcome //
		// jvm will give referance of same welcome string to p 
		
		
		
		// why strings are immutable in java 
		// it is immmutaable beacause referance of "welcome" my be hold by multiple valrible 
		// and if you want to change that string so all variable will get change 
		// welcome 
		// welcome home
		
	 // s=   s.concat(" home ") ;
		System.out.println(s);
		
		System.out.println(s == l); // == check reference point of  both  false
		System.out.println(s == p); // true
		System.out.println(s == l);
		
		System.out.println(s.equals(l)); // equals check value only and value are same that why it is true 
	  //System.out.println(s.charAt(0)));
		
		
		StringBuffer stt  = new StringBuffer("Sachin") ;
		stt.append(" Parmar") ; // will not work in multi-threading 
		
		
		//
		StringBuilder sttt  = new StringBuilder("Sachin") ;
		sttt.append(" Parmar------") ;
		System.out.println(sttt); //will  work in multi-threading 
		
		//System.out.println(stt == sttt);
		
		// == operator compare only those object which have same class , so these  two cn't be comppare b
		//because they are diffent class 
		
		System.out.println(stt.equals(sttt)) ;
		
		
		Stringgg sss  = new Stringgg ()  ;
		sss.direction = Direction.EAST ;
		sss.ss = Size.xl ;
		
		System.out.println(sss.ss);
		
		char[] ch={'j','a','v','a','t','p','o','i','n','t'};  
		String sh=new String(ch); 
		String shhh  = new String("Sachin");
		
		
		
		
	}
}
