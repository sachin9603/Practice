package oct24.CustomExcetpion;

import java.io.*;

public class SimpleClass {
	
	
	
	public static void main(String[] args) {
		String data  = "This is very Imp Data" ;
		byte arr[] = data.getBytes()  ;
		
		
		try(
			FileOutputStream file  = new FileOutputStream("AJPNEW.txt") ;
			
				
				
			) {
			
			file.write(arr) ;
			
		}catch(Exception  e) {
			
			System.out.println(e);
		}
		
		
		System.out.println("resource are close ");
		
		
	}

}
