package Sep4.TryWithResource;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TryWithResource {
	
	public static void main(String[] args) {
		
//		
//		Scanner sc  = new Scanner(System.in) ;
//		// what is replacemkent of fianlyy block 
//		// finally k ander jikso close karna ahi 
//		sc.close();
		
		//FileOutputStream outputt  =  new  FileOutputStream("Sachin.txt") ;
	
		//outputt.close(); // isko humesha finallyblock mai daalo 
		Scanner sc 
		FileOutputStream output = null ;
		try {
			 output  = new  FileOutputStream("sachin9287.txt") ;
			String msg = "welcome this AJP course " ;
			
			byte[] arr  = msg.getBytes() ;
			output.write(arr) ;
			System.out.println("yes work done ");
			
		}catch (Exception e ) {
			System.out.println(e);
		}finally {
			try {
				output.close() ;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// iska replacement hai try with resource 
		
		
	}

}
