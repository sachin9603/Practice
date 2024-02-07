package feb4;

public class A {
	
	int a  = 12  ;
	String s = "Sachin" ;
	
	
	A() {
		
		a = 15  ;
		s  = "parmar" ;
		
		System.out.println(a +" " + s);
	}
	
	// copy constructor 
	
	A(A refref ){
	
		a =  refref.a ;
		s  = refref.s ;
		
		System.out.println(a +" " + s);

		
		
		
	}
	
	public static void main(String[] args) {
		
		
		A ss = new A () ;
		
		A sss  = new A(ss) ;
		
		System.out.println();
	}

}
