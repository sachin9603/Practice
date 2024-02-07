package feb2;

import java.io.File;
import java.io.IOException;

public class FileInformation {
	
	public static void main(String[] args) {
		
	
	
		File myFile = new File("C:\\Users\\Anudip\\OneDrive - Anudip Foundation for Social Welfare\\Desktop\\newFile\\firstTextFile.txt") ;
		
		try {
			
			if (myFile.exists()) {
				
				System.out.println("file name " + myFile.getName());
				System.out.println("file Absolute path " + myFile.getAbsolutePath());
				System.out.println(" is my is writeable  " + myFile.canWrite() );
				System.out.println("is my file is readable  " + myFile.canRead());
				System.out.println("file length is into Byte  " + myFile.length());
			}
				
				
			
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
