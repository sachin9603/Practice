package pack01;

public class Student {
	
	public  String studentName = "sachin" ;// anywhere 
	
    private int studentId = 123 ; // within class
	
	protected String studentSubject = "Java"; // withing class , within package  , in sub class or child class of different package
	
	String studentCollegeName  = "Sage" ; // in class and in package 
	
	
	
	// implicity class ka obj return karega 
	// or ye banane jarurat nahi hai ye automatic jvm bana dega always
	//  or duniya mai jab bhi obj banega  is class ka ye is 
	// constructor k through hi ban raha hai ye
	
	
	
	
	
	
  public void  go( ) {
	  
	 // System.out.println();
    	
	  System.out.println(" anuual report ");
	  
	 // return "Kuch bhi" ;
	  
      }
	
//	}
	
	// parameter construtor  
  // isme parameter n hai 
  
  public  Student(int n  ){
	  System.out.println("Student rank is "  + n);
  } ;
	
  // jab bhi hum parameterised contructor bana rahe hai 
  // tab default constuctor jo jvm de raha hai vo nahi provide hoga 
  
  
  
  
  //nonparameter 
  public Student() {
	  
  }
//  
//
//}
