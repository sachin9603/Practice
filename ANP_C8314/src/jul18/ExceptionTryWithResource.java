package jul18;

import java.io.FileOutputStream;
import java.util.Scanner;

public class ExceptionTryWithResource {
	
	
	public static void main(String[] args) {
		
		//Scanner sc  = new Scanner(System.in) ;
		
		
		
		
		//sc.close();\\\
		
		
//		try(
//		
//	dvdfadsflkjadslfiajdsfglasdkjf
//	          ) {
//			
//			// resource open kara 
//			
//		}catch {
//			
//		}finally {
//			//resoucce ko close kar dete the 
//			
//		}
		
		
		
		// Try block to check for exceptions
        try (
 
            // Creating an object of FileOutputStream
            // to write stream or raw data
 
            // Adding resource
            FileOutputStream fos
            = new FileOutputStream("Sachintextfile.txt")) {
        	
        	
        	
 
            // Custom string input
            String text
                = "Hello World. This is my java program";
 
            // Converting string to bytes
            byte arr[] = text.getBytes();
 
            // Text written in the file
            fos.write(arr);
        }
 
        // Catch block to handle exceptions
        catch (Exception e) {
 
            // Display message for the occurred exception
            System.out.println(e);
        }
 
        // Display message for successful execution of
        // program
        System.out.println(
            "Resource are closed and message has been written into the gfgtextfile.txt");
		
		
		
		
	}

}
