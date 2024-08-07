package Aug6.DesignPattern;

public class Test2 {
	
	public static void main(String[] args) {
		
		SingletonExample firstObj  = SingletonExample.getInstance() ;
		
		// i want to clone that firstObj object 
		
		try {
			SingletonExample secObj   = (SingletonExample)firstObj.clone() ;
			System.out.println(secObj.hashCode());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println();

		
		
		
		
	}

}
