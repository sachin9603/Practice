package Oct18.finall;

public class Deemo {
	
	// variable ----
	// method ----- 
	// class 
	
	final String property = " we all are highly spritual from inside " ;
	
	final String nationality  ;
	
	
	public Deemo(String s) {
		this.nationality  = s ;
		
	}
	
	public final void crying() {
		System.out.println("yes more and more ");
	}
	
	
	//property =  "somthing " ;
	
	public static void main(String[] args) {
		
		final String adhar = "898980870808" ;
		
		//adhar = "90089943" ;
		
		System.out.println(adhar);
	
		Deemo dd  = new Deemo("indian")  ;
		//dd.property  = "I am not like all of you" ;
		
	String jj =	dd.property ;
	System.out.println(jj);
	
	Deemo paul  = new Deemo("Indian") ;
	System.out.println(paul.nationality );
	//paul.nationality = "american" ;
	
	
	
		
		
	}

}
