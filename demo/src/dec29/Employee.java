package dec29;
// Entergface will always use is  A 
// ek interface dusrse  interface ko extends karta hai 


public interface Employee {

	
	//An interface in Java is a blueprint of
	//a class. It has static constants and abstract
	//methods.
	
//	The interface in Java is a mechanism to 
	//achieve abstraction. 
	
	// hiding complexity and showing functionality 
	
	
	// srf abstrct method  yaa static  with body 
	
	// a method without body  
	// showing functionality  and  hiding complexity 
	 abstract void saveEmployee();
	 
	 void findEmployee() ;
	 void deleteEmployee()  ;
	 
	 // static method ko har class mai override  nahi karege 
	  static void getAllEmployee() {
		  
		  System.out.println("these are all employee ");
		  
	  };
	 
	 
	 private void showEmployee() {
		 System.out.println("Sachin");
	 }
	 
	 
	 
	 
	 
	static void shiftTiming() {
		
		System.out.println("shift time has been changed  from 10 to 7 pm ");
		
	 }
	
	//It is used to achieve abstraction and 
	//multiple inheritance in Java.
	
	// jab  1 class  do classs ko inherit kar rhahi hai toh 
	// that is multiple inhertance 
	
	 
	
	
}
