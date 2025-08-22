package Keyword;
// final class bana di toh is class ko koi extend dnahi kar payga 

public class Finalll {
	
	final String adhar; //non--initialise final varibale 
	
	final String pan  = "682723467334" ; // ab change nahi hoga 
	
	
	// then you need initalize with constructor // it is mandatory 
	
	Finalll (String s ) {
		
		this.adhar = s;
		
	}
	 
	// cn not be change // but can not override
	final void shift()  {
		System.out.println(" 10 to 6 ");
	}
	
	public static void main(String[] args) {
	final String a  = "welcome" ; // once a varibld declare by final , it wll nevere be change 
	

	// a = a + " home " ; ye nahi ho sakta 
	
	Finalll hhh  = new Finalll("84561239845612") ;
	
	//hhh.adhar  = "78789798798890" ;
	
	System.out.println(hhh.adhar);
	
	
	
	}

}
