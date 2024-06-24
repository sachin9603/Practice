package june21.abstracttt;

public abstract class DemoAbstract{
	//It can have abstract and non-abstract methods (method with the body).
// concrete method and abs 
	//It needs to be extended 
	//It cannot be instantiated.
	//It can have constructors and static methods also.
	//It can have final methods which will force the subclass not to change the body of the method.

	
	 public abstract void saveCutomerDetails() ;
	 // this is the abstrct method that its implimentation part would be in child class
	 
	 
	 // concrete method also
	 
	 public void bankLogo() {
		 System.out.println(" you all can see this thing ");
	 }
	
	 // one more abs class
	 public abstract void takeLoan();
	 
	 
	public  DemoAbstract() {
		this(100) ;
		System.out.println("abstrct class normal contructor ");
		
		 
	 }
	
	private DemoAbstract(int speed) {
		System.out.println("speed is "+speed);
	}
   
}
