package ReadDataFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Readintomap {
	

	   public static void main(String[] args) {
		   // api intregataion and microservice 
		   HashMap<String, Integer>  mp  = new HashMap<>() ;
		   
	        try {
	            File file = new File("example.txt");
	            Scanner reader = new Scanner(file);
	            while (reader.hasNextLine()) {
	                String data = reader.nextLine();
	                
	                String []dataArray = data.split(" ");
	                
	                //if(mp.containsKey(dataArray[0])) {
	                	mp.put(dataArray[0], Integer.parseInt(dataArray[2])) ;
	               // }
	                
	                System.out.println(data);
	                
	                
	            }
	            reader.close();
	        } catch (FileNotFoundException e) {
	        	
	        	
	        	
	        }
	        
	        for (Map.Entry<String, String> entry : mp.entrySet()) {
	            System.out.println(entry.getKey() + " = " + entry.getValue());
	        }

	        
	        }

}
