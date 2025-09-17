package oopss.inheritance;

public class Demo {
	
	public static void main(String[] args) {
		
		
		Developer e1  = new Developer()  ;
		
		    e1.name  = "siya" ;
		    e1.email = "siya@gmail.com" ;
			e1.salary = 800000;
			e1.bonus =811556 ;
			e1.shift = "8 to 10 " ;
			e1.takingScrum();
			
			Tester t = new Tester()  ;
			t.totalBug =10 ;
			t.bonus =45000;
			t.email ="T@gmail";
			
			
			Developer d = new Developer( "AK" , 4556 , "A@Gmail.com","78978" ,"AK!@#" , "10 se 4" , 7898);
			
			System.out.println(d);
			
			d.sum(78, 45);
			d.sum(78, 78, 78);
			d.doingJOB();
			
			/// poly --- morph 
			
			
			// complie time  ---- overloading  ---- ek hi method k ek hi class mai changing type of and number parameter
			//run time  --- overrideing ---  --- parent ki method child mai bhi with same method signature 
			
		
	}

}
