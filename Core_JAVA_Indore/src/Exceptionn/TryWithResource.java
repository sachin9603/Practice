package Exceptionn;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TryWithResource
public class TryWithResource {
	
	public static void main(String[] args) {
//		 BufferedReader br = null;
//	        String str = " ";
//	        
//	        System.out.println("Enter the file path");
//	        br = new BufferedReader(new InputStreamReader(System.in));
//	        
//	        try() {
//				str = br.readLine();
//				System.out.println("line 20");
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//	        
		
		
		 try (

		            // Creating an object of FileOutputStream
		            // to write stream or raw data

		            // Adding resource
		            FileOutputStream fos
		            = new FileOutputStream("gfgtextfile.txt") ) {

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

	        
		 System.out.println("las line");
	        
	        
	        
	        
	       
	        }
	}
	
	
	


