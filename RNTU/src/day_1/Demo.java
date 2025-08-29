package day_1;

import oops.Human;

public class Demo {
	
	// block {}
	// comments --- are those lines between our code which are providing information about code 
//	jksdvfjkbsdf
//	asdadffjbvsdjf Jankani 
//	askjdbdvkajd
//	haljdh -------- for doing comment into bulk select that code and "ctrl+/"
	// main ctrl+ space 
	// it is kind of function which is starting point to enter into entire project 
	public static void main(String[] args) {
		
		// for printing any thing in java we have to use syso
		
		// syso+ctrl+space 
System.out.println("Welcome to Java Training by Anudip foundation and IBM");
		


// what are identifiers 
// it is name of variable , method , class,  interface , package , project

 
  int a = 10  ; // variable name will strt with small case always , camel case
  
  int rohanAge  = 25  ; // Camel case 
  
  // class name -- starts with capital 
  // PascalCase--- ThisIsPascalCase
  // you can use only $ and _ as special character
  
  
  
  // literals 
  
  //Literal is a constant/value assigned to the variable.
 
  // Integer int , short , byte char
  // Decimal -- float and double 
  
  // size  range
  byte b1  = 20 ; //  - 127 to 126 , default  = 0 , 8 bits = 1 byte 
  short kk  = 25  ; // 2 byte 
  int sk  = 40  ; // 4 byte 
  char l = 20 ;  // 2 byte
  long op  = 783794839; // 8 byte 
  
  System.out.println(b1);
  
  float  kl  = 90.4f ;
  double k8 =  83038.0989;
  
  
  boolean jk  = true  ;// 1 byte 
  
  
  
 // java have 8 primitive data type 
  
  
  //+, -, *, /, %, ++, --
  
  int io =  45  ;
  io  = io +30  ;
  System.out.println(io);
  
  int fg  = 89  ;
  
  System.out.println(fg%5);
  
  int q  = 5  ; // ++  it will increase vaule by one 
  q++  ;//post increament --- it will do operation first then increase the value 
  ++q; // pre increment --- it will increase value first then do operation 
  
  System.out.println(q++);//  pehle 7 print karega then value badayega 
  System.out.println(++q);// 9 phle value badegi then print hogi 
  
  
  int aaa=5; //     // 6     7        7        8
  System.out.println(++aaa - ++aaa + aaa++  + aaa++ );
  
  System.out.println(aaa);// 9
  
  int aa=5;         // 4    3      4   4        2 + 2      2     +2    
  System.out.println((--aa+--aa)*(++aa-aa--)+(--aa+aa--)*(++aa + aa++));

  
  
  
  int ak = 5;
         //5       7    6      6 
  int b = ak++ + ++ak + --ak + ak--;
  System.out.println(ak + " " + b);
  
  
  int i = 1;
        //1     2       2     3
  int j = i++ + i++ + --i + ++i;
  System.out.println(i + " " + j);
  
  
   String s  = "Sachin" ;
   
   
   // primitive datatype ----  int short long byte double float char boolean 
   /// wrapper class  -------integer
   // non primitive data type  -- means ye obj hote 
   
   
   // class is frame work for creating obj
   // choching-----{time --- 6 to 8 , sub - java advance , batch - 30  }
   // batch 101 --
		
   
   Student s1 = new Student() ; // s1 is object of student class 
   
   s1.name  = "Rakesh" ;
   s1.roll = 7897 ;
   s1.sub = "MATH";
   
   int e  = 90  ; // e is not object 
   Integer  mn  = 90  ; // mn is object of Integer class 
   
   String qqq  = "23222" ;
   
   int  vcv  = Integer.parseInt(qqq) ;
   
   System.out.println(vcv+ 10);
   
  

   
   
   
   
   System.out.println(Integer.MIN_VALUE);
   
   Short jhk = 80  ;
   
   Long opp = 900900L  ;
   
   Double bv  = 898.32 ;
   
   Boolean gf  = true  ;
   
   Byte  qwq  = 92;
   
   Character  bh = 'a';
   
   Float kdl = 898.2f ;
   
   
   byte  gh  = 89  ;
   
   int y  = gh ; // this is doing automatic by jvm --->>>  implicit casting 
   // when you are widing the data type then it will be automatic done by jvm 
   
   
   int ii = 122  ;
   
  // byte hg  = ii  ; // when you are narrowing the data type then it would not be done by jvm automatic 
   
   
   byte hg  = (byte) ii  ;
   System.out.println(hg);
   
   Human ssss = new Human()  ;
   ssss.genticcode ="asdfasdf784512451564" ;
   
  
   
   /// 
   
   
  
   
   
   
   
   
   
   
   
   
   
   
		
	}
	
	
	
	

}
