package Aug6.DesignPattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test3 {
	
	public static void main(String[] args) {
		SingletonExample fist  = SingletonExample.getInstance() ;
		
		System.out.println(fist.hashCode());
		
		//serialization of this first obj  
		
		try {
			ObjectOutputStream out = new  ObjectOutputStream(new FileOutputStream("Andp.txt"));
			  
			out.writeObject(fist);
			out.close(); 
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} ;
		
		
			
		
		// deserialization  
		ObjectInputStream input;
		try {
			input = new  ObjectInputStream(new FileInputStream("Andp.txt"));
			try {
				SingletonExample SingletonExample2nd= (SingletonExample)input.readObject() ;
				
				System.out.println(SingletonExample2nd.hashCode() );
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		
		
		
		
		
		
		
	}
	

}
