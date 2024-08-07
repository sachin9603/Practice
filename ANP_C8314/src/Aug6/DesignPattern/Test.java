package Aug6.DesignPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
	
	
	public static void main(String[] args) {
		
	    SingletonExample  s = SingletonExample.getInstance() ;
	    
		
	    Constructor<SingletonExample> cons = null ;
		try {
			cons = SingletonExample.class.getDeclaredConstructor();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	  cons.setAccessible(true);
	  
	    SingletonExample newObj = null;
		try {
			
			newObj = cons.newInstance();
			
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
	    
	    
	    
		System.out.println(s.hashCode());
		System.out.println(newObj.hashCode());

		
		
	}

}
