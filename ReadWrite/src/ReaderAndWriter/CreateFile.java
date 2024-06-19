package ReaderAndWriter;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	
	  public static void main(String[] args) throws IOException {
	      
	            // Specify the file name and path
	            File file = new File("example.txt");

	            // Create the file
	            if (file.createNewFile()) {
	                System.out.println("File created: " + file.getName());
	            } else {
	                System.out.println("File already exists.");
	            }
	     
	  }
	        

}
