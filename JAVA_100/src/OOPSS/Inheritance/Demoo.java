package OOPSS.Inheritance;
// super class  , parent class 
public class Demoo {
	
	
	//inheritance ---- when offsprings inherits property of its parent 
	
	// class ---and is class ko ek class extend ----> child class 
	
	/// single  A---> B
	// multi-level A----> B ---> C
	// Hierarchical Inheritance A---> B,C,D
	// Multiple ---->> A (print)B (print)----> C  this is no possible in java XXXXX
	// Hybrid Inheritance in Java --- single + Hierarchical --- A--> B---> C, D
	
	public static void main(String[] args) {
		
		Developer d  = new Developer()  ;
		d.empName  = "Sachin" ;
		d.empAdd  = "Indore" ;
		d.bonus = 450000;
		d.fixingBug();
		
		JuniorDeveloper j = new JuniorDeveloper()  ;
		j.bonus = 6000;
		j.empName = "Rakhi" ;
		j.fixingBug();
		j.learning();
		
	}

}
