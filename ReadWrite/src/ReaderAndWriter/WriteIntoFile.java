package ReaderAndWriter;

import java.io.FileWriter;
import java.io.IOException;

public class WriteIntoFile {
	
	public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, this is a sample text written to the file.");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            
        }

}
}
