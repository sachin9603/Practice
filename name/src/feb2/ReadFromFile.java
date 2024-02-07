package feb2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {
	
	public static void main(String[] args) {
		
		File myFile = new File("C:\\\\\\\\Users\\\\\\\\Anudip\\\\\\\\OneDrive - Anudip Foundation for Social Welfare\\\\\\\\Desktop\\\\\\\\newFile\\\\\\\\firstTextFile.txt") ;
		
		try {
			Scanner myReader  = new Scanner(myFile) ;
			
			while(myReader .hasNextLine()) {
				
				String data = myReader.nextLine();
				
				System.out.println(data);
				
				System.out.println("next line");
			}
			
			myReader.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
