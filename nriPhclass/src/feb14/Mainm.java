package feb14;

public class Mainm {
	
//	synchron{
//		System.out.println("Sachin");
//	}
	public static void main(String[] args) {
		Common c  = new Common() ;// yaha par ek lock bhi create hotahai 
		
		Common c2  = new Common() ;
		
		// classlevel lock chahiye static bhi or synchronized
		
		ThreadA a = new ThreadA(c , "Banesingh") ;
		
		ThreadB b = new ThreadB(c2 , "Bhupender jogi") ;
		
		a.start(); 
		b.start();
		
	}

}
