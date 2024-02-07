package dec28;

public class Main {
 
	// class name will be started with only upper case 
	// except class everything will strt with small case
	
	public static void main(String[] args) {
		
		int x =  10  ; 
		 int y  = 17  ;
		 int z  = x+y ;
		 
		 System.out.println(z);
		
		 
		 // +, -, *, /, %, ++, --
		
		 
		
		 
	//	 mujhe chiye ki 500 ka 20 percent nikal jaaye 
		 
		
	//	 % ye  kaam ata hai reminder batane k liye  17 % 5 =2
		 
		 
		 
		 System.out.println(17%5);
		 
		 System.out.println(34%5);
		 
		 System.out.println(15%5);
		 
		 
//		 2. Assignment Operators:
//			 =, +=, -=, *=, /=, %=
		 
		 
		// ++, --
		  x++ ; // 11  post increment --- tph pehle operation hoga then value badegi 
		  
		  
		  ++x ; // pre increment  ---- toh pehle value badegi then operation 
		  
//		  
//		  x-- ; // 10
//		 
//		  --x ; //pren
		         ///  12+  16 
		  
		  int  m = x++ + --y ; 
		  System.out.println(m);
		  
		  
		  
		//  2. Assignment Operators:
//				 =, +=, -=, *=, /=, %=
			  
			  int c  =  10  ;
		  
		  c /=  2  ; // 5 
		  
//		  Comparison Operators:
//			  ==, !=, <, >, <= , >=
		 // =, +=, -=, *=, /=, %=
		  
		//  age = age>18
		  
		 int  age = 17  ;
		 
//		 
//		 if (age != 18) 
//		 {
//			 System.out.println("you can vote ");
//		 }
		  
		 
		// System.out.println(age != 18);
		 
//		 6. Short-Circuit Operators:
//			 &&, ||
		 
		 String nationality = "Indian" ;
		 
		 if (age >= 18 || nationality == "Indian" ) 
			 {
				 System.out.println("you can vote ");
			 }
		 
		 // int , char , boolean  , short  , long ,byte , float and double 
		 
//
//Data Type	Default Value	Default size
//boolean	false	1 bit
//char	'\u0000'	2 byte
//byte	0	1 byte  -128 to 127 
//short	0	2 byte -32,768 to 32,767 
//int	0	4 byte  2,147,483,648 (-2^31) to 2,147,483,647 
//long	0L	8 byte   -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
//float	0.0f	4 byte float f1 = 234.5f  
//double	0.0d	8 byte  double d1 = 12.3  

			
		 
		 
//		 Primitive Data Types : Wrapper Classes
//		 byte : java.lang.Byte
//		 short : java.lang.Short
//		 int : java.lang.Integer
//		 long : java.lang.Long
//		 float : java.lang.Float
//		 double : java.lang.Double
//		 char : java.lang.Character
//		 boolean : java.lang.Boolean
		
		 //koi class ka use nahi huva hai 
		 
//		 int ddd  = 151324567890  ;
//		 
//		 Integer dd  = 999 ; // yaha ek object creatre huva 
//		 
//		 
//		 System.out.println( ddd.MAX_VALUE);
//		 
		 
		 System.out.println(Byte.MIN_VALUE+"----->"+Byte.MAX_VALUE);
		 System.out.println(Short.MIN_VALUE+"---->"+Short.MAX_VALUE);
		 System.out.println(Integer.MIN_VALUE+"----->"+Integer.MAX_VALUE);
		 System.out.println(Long.MIN_VALUE+"----->"+Long.MAX_VALUE);
		 System.out.println(Float.MIN_VALUE+"----->"+Float.MAX_VALUE);
		 System.out.println(Double.MIN_VALUE+"----->"+Double.MAX_VALUE);
		 System.out.println(Character.MIN_VALUE+"----->"+Character.MAX_VALUE);
 //type casting 
		 
		 
		  //ek data type se dusare data type mai chije convert kardena is called typecasting 
		 
		 
//		 There are two types of primitive data types type castings.
//		 1. Implicit Type Casting(Automatic )
//		 2. Explicit Type Casting (manually )
		 
		 byte bite = 12  ;
		 
		 int i  = bite  ;
		 
		
		 System.out.println(bite+" "+i);

		 
		 
//		 
		 
		 
		
		 
		 
		 
		 
		 
		 
		 
		 
		
		  
		 
		  
		 
		 
				 
		 
		
	}
	
	
}
