package oops;

public class Demo {
	
	// class  --- upper class( ) , middle class  , i class , 2nd class 
	// obj
	
	
public static void main(String[] args) {
	
	Upperclass persons1 = new Upperclass()  ;
	
	persons1.name= "virat";
	persons1.location ="MUM" ;
	persons1.carCompany ="BMW";
	
	int moneyperday = persons1.doingInvestment();
	System.out.println(moneyperday);
	
	
	Upperclass person2 = new Upperclass()  ;
	
	
    person2.carCompany  = "RollRoyals" ;
    person2.name  = "AMITAB" ;
    person2.location = "MUM" ;
   
    
    
    Student s1  = new Student ()  ; // by default contructor
    
    
    
    
    s1.name  = "Irshat" ;
    s1.address  = "Bhopal";
    
    s1.roll = 74107410 ;
    
    s1.mocktest(); 
    
    System.out.println(s1.name);
    
    
    Human kelash   = new Human()  ; // kelash obj ko bana rahah hai 
    // jese hum sab human ko parents nai banaya 
    // jese ki car ko ek factory nai banaya hai 
    kelash.bodyweignt = "50";
    
    
   //  vese hi saare object ko java mai constructor bana raha \
    
    // 
    
    
    Student s2 = new Student(7410 , "Anil", "inodre") ;
    
 
    s2.display()	;
    
    Student s33 = new Student(8585285 , "Shubhammm ", "Bhopalll") ;
    
    s33.display();

	
	
	
}
}
