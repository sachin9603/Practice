package feb14;

public class Mainm {
	
//	synchron{
//		System.out.println("Sachin");
//	}
	public static void main(String[] args) {
		Common c  = new Common() ;// yaha par ek lock bhi create hotahai 
		
		Common c1  = new Common() ;
		
		ThreadA a  = new ThreadA(c , "Banesingh") ;
		
		ThreadB b  =new ThreadB(c1 , "Bhupender jogi") ;
		
		a.start(); 
		b.start();
		
	}

}
