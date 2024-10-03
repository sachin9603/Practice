package oct1;

public class Ploymorphismmm {
	///over load ----compile time polymorphism 
	public int add(int a  , int b) {
		int sum  = a+b ;
		return sum ;
		
 	}
	
	public int  add(int a  , int b ,int c) {
		int sum  = a+b+c ;
		
	return sum ;
		
 	}
	public static void main(int s ) {
		System.out.println("sachin + " + s);
	}
	
	
	
	public static void main(String[] args) {
		
		 // Ploy --------> morphism
		
		
		// method {}  // ko reuse  karne k liye ye concept aya or issase code readablity 
		
		// overload  -----  
		// override 
		
		Ploymorphismmm pp  = new Ploymorphismmm () ;
		
		int s   = pp.add(12, 18) ; 
		System.out.println(s);
		
		int  k  = pp.add(12 , 12 , 12) ;
		System.out.println(k);
		
		pp.main(55);
		
		
		
	}

}
