package basicJava;

public class Oprts {
	
	public static void main(String[] args) {
		
		int s  = 12  ;
		 int b  = 5 ;
		 int c  = s+b  ;
		 System.out.println(c);
		 System.out.println(s-b);
		 
		 System.out.println(s*b);
		 System.out.println(s/b);
		 System.out.println(s%b);// module remainder batayega  
		 
		 System.out.println("========================================");
		 //++s ; // ek se badti   bolte hai pre increment
		 System.out.println(++s); // 13
		 
		 System.out.println(s++); // post increment  //13
		 
		 System.out.println(s); //14
		 // pehle value badegi then  operation
		 // pehle value operation karegi then  value badegi 
		 
		 
		 int pp  = 77 ;
		 
		 pp  += 2 ; 
		 // pp = pp  + 2; 
		 
		 System.out.println(pp); // 79 
		 
		  pp -= 3  ;
		  System.out.println(pp); // 76   
		  
		  
		 
		  pp *= 2  ;
		  System.out.println(pp); //   152 
		  
		  pp /= 2  ;
		  
		  System.out.println(pp); // 76 
		  
		  pp %= 5  ;
		  
		  System.out.println(pp); // 1 
		  
		  if(pp == 1) { // do chije  == 
			  System.out.println("yes sahi hai humara");
		  }else {
			  System.out.println("ooh galat hai humara");
		  }
		  
		  
		  
		  if(pp > 1) { // do chije  == 
			  System.out.println("yes sahi hai humara");
		  }else {
			  System.out.println("ooh galat hai humara"); // ans 
		  }
		  
		  
		  if(pp < 1) { // do chije  == 
			  System.out.println("yes sahi hai humara");
		  }else {
			  System.out.println("ooh galat hai humara"); // ans 
		  }
		  // actual value  1 
		  if(pp <= 1) { // do chije  == 
			  System.out.println("yes sahi hai humara"); //ans
		  }else {
			  System.out.println("ooh galat hai humara"); // 
		  }
		  
		// actual value  1 
		  if(pp >= 1) { // do chije  == 
			  System.out.println("yes sahi hai humara"); //ans
		  }else {
			  System.out.println("ooh galat hai humara"); // 
		  }
		  
		  
		  // and  or 
		  
		  String name  = "sita" ;
		  int age  = 21  ;
		  
		  if(name =="Sachin" && age == 25) {
			  System.out.println("yes pura data sahi hai");
		  }else if (name =="Sachin" || age == 25) {
			  
			  System.out.println(" dono mai se kuch toh sahi hai ");
			  
		  }else {
			  System.out.println("sab galat hai ");
		  }
		   
		 
		 
		
		 
		
		
	}

}
