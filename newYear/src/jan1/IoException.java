package jan1;

import java.io.IOException;
import java.util.Scanner;

public class IoException {
	
 public static void print() throws ArithmeticException{
	 
	 
	 Scanner sc  = new Scanner(System.in) ;
	 
	 int ss = sc.nextInt() ;
	 
	 if(ss == 0) {
		 throw new ArithmeticException("give details is not right") ;
		 
	 }
//	 if(ss == 0) {
//		 throw new IOException("give details is not right") ;
//		 
//	 }
	 
	 
 }
	
	public static void main(String[] args) {
		
		print() ;
		
		
//		try {
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
	}
	

}
