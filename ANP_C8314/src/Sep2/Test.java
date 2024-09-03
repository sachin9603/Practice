package Sep2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException  {
		
//		HeavyResource  obj1   = new HeavyResource() ;
//	
//		
//		HeavyResource  obj2   = new HeavyResource() ;
//		
//		
//		System.out.println(obj1.hashCode());
//		
//		System.out.println(obj2.hashCode()); 
		
		// i want single object on multiple call
		
		
		
		HeavyResource  obj1   = HeavyResource.getInstance() ; // we will get fresh object 
		
		
		//HeavyResource  obj2   = HeavyResource.getInstance() ; // purana object aapko mil jaayea
		
		
		System.out.println(obj1.hashCode());

		
		
	//	System.out.println(obj2.hashCode()); 
		
		
		///refection api to break the singleton    
		
		//// serilazation or deserilazation 
		
		//cloneing 
		
		
		
		// cloning vala tarika  
		
		
		
		//HeavyResource  newObjectWithCloning =  (HeavyResource)obj1.clone() ;
		
	//	System.out.println(newObjectWithCloning.hashCode());
		
		
		
		// refection api  
		
		Constructor<HeavyResource> cons;
		try {
			cons = HeavyResource.class.getDeclaredConstructor();
			
			cons.setAccessible(true);
			
			

			try {
			HeavyResource  HeavyResourceNewWithReflex =  cons.newInstance();
			
				System.out.println(HeavyResourceNewWithReflex.hashCode());
				
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		// Serialization
    
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("serial.txt")) ;
		
		out.writeObject(obj1) ; 
		out.close(); 
		
		// Deserialization
		
		
		ObjectInputStream in  =  new ObjectInputStream(new FileInputStream("serial.txt")) ;
		
		HeavyResource  nayaBySerialization = (HeavyResource)in.readObject() ; 
		
		System.out.println(nayaBySerialization.hashCode());
		
		
		in.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
