package Abstractttt;

public interface Emoployee {
	
	// pulic concrete class is not allowed
//	public void saveData()  {
//		
//	}
	
	// default concrete method is allowed 
	default void saveData()  {
		
 }
	
	// static  concrete method is allowed 
	public static void loadData()  {
		
	 }

	// this is abstract method by default  ------> it is public and abstract 
	 void login() ;
	
	 
	 // , compiler  adds public, static and final keywords before data members.
	int salary = 50000 ;
	
	
	
	
	
	
	
	
	
	
	

}
