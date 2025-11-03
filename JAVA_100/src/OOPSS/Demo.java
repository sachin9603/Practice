package OOPSS;

public class Demo {
/// oops 
	/// class , object , access modifiers , 
	// constructor vs default constructor 
	// Encapuslation  , inheritance , polymorphism , Abstraction 
	
	
	
	
	public static void main(String[] args) {
		
		
		Human sachin = new Human() ;
		sachin.eye = 2  ;
		sachin.leg = 2  ;
		
		sachin.belive();
		
		sachin.greedyness();
		
		
		

		Human rahul = new Human() ;
		
		rahul.name = "Rahul Prasahar" ;
		rahul.geneticCode  = "879823sfsdwrwe4r" ;
		
		rahul.display();
	
		
	Employee e1 = new Employee()  ;
	e1.empAddress = "indore" ;
	e1.empName = "RAKA" ;
	e1.salary  = 80000 ;
	
	e1.dispaly();
	
	Employee e2 = new Employee("KALI" , "PITAMPUR" , 65000);
			e2.salary = 80000;
			
			e2.dispaly();
	
		
		
		
		
		
		
	}
}
