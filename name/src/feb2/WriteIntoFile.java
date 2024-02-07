package feb2;

import java.io.FileWriter;
import java.io.IOException;

public class WriteIntoFile {
	
	
	public static void main(String[] args) {
		
		try {
			FileWriter myWrite  = new FileWriter("C:\\\\Users\\\\Anudip\\\\OneDrive - Anudip Foundation for Social Welfare\\\\Desktop\\\\newFile\\\\firstTextFile.txt") ;
			
			myWrite.write("We are from 6878 batch and we learning everthing day by day");
			String s ;
			myWrite.close();
			System.out.println("yes it has been written ");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
