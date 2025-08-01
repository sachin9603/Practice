package exceptionHandling;

import java.util.Scanner;

public class Demo22 {
	
	
	public static void main(String[] args) {
		
		Scanner sc  = null  ;
		
		//error 
		
		//System.exit(0);
		try ( sc= new Scanner(System.in) ) {
			int ans  = 100 /0  ;
			
			
		
			
	
			
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
			
		}finally {
			sc.close();
			
			System.out.println(" this code will must executed evertime ");
		}
	}

}
