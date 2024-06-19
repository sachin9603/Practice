package ReadDataFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) throws FileNotFoundException {
		File  file = new File("C:\\Users\\Anudip\\OneDrive - Anudip Foundation for Social Welfare\\Desktop\\hariom.txt");
		
	try {
		boolean tt  = 	file.createNewFile() ;
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		
		
    try {
        FileWriter writer = new FileWriter("C:\\\\Users\\\\Anudip\\\\OneDrive - Anudip Foundation for Social Welfare\\\\Desktop\\\\hariom.txt");
        writer.write("Hello, this is a sample text written to the file.");
        writer.close();
        System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrac
		
		
		
		
		
		
	Scanner sc  = new Scanner(file);
	
	String pp = sc.nextLine() ;
	System.out.println(pp);
	
	
	
		

	
		
	}
}
