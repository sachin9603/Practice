package dec9.TryWithResource;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo {
	
	
	public static void main(String[] args) {

		try(// please put the resource that want to close 
				
			FileOutputStream	 fileOutputStream  = new FileOutputStream("ANP8512.text")  ;
				
				// this resource will get close automatically 
				
				){
			// there are some  object which called resource which needs to be 
			// close becauase they are directly serving data to java language 
			// file , database 
			
			
		
			
			String msg = "I love my Bharat" ;
			// i want to write this msg into my file ANP8512
			
			// you  need to convert data into byte 
			
			byte bytearry[]  =  msg.getBytes();
			
			System.out.println(Arrays.toString(bytearry));
			
			fileOutputStream.write(bytearry); 
			
			System.out.println(" data has been written successfully  into file ");
			
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
