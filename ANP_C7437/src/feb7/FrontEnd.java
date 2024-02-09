package feb7;

 //FrotEnd is a type employee
public class FrontEnd  extends Employee {
	// parent class hai employee
	// child is FrontEnd 
	// or kese bani yue by extends key 
	
// @ override will make sure whereter your method signaure is same as parent class signature or noit 
	
	@Override
	public int salary() {
		
		///  1000
		
		return 90000 ;
		
	}
	
	/// method overloading 
	
	public int add(int a  , int b) {
		return a+b ;
		
	}
	
	public int add(int a  , int b , int c) {
		return a+b+c ;
		
	}
	

}
