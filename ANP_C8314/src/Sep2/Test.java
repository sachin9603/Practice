package Sep2;

public class Test {
	
	public static void main(String[] args) {
		
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
		
		
		
		HeavyResource  obj1   = HeavyResource.getInstance() ;
		
		
		HeavyResource  obj2   = HeavyResource.getInstance() ;
		
		System.out.println(obj1.hashCode());

		
		
		System.out.println(obj2.hashCode()); 
		
		
		
		
		
		
		
		
	}

}
