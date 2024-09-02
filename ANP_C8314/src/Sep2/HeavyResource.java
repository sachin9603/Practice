package Sep2;

public class HeavyResource { 
	
	// these is the class which require too much time to load. 
	// suppose 10000 lines of code is there 
// i want to create a single object of these class only and i want to use that object through out the session 
	// and to create such resource we need a class and that class is called singleton class
	
	
	// there is default cons. 
	
	// sptep 1 to create private cons ..
	private HeavyResource() {} ;
	
	
	// step 2   early  or eager
	private static HeavyResource  instance  = new HeavyResource() ;
	
	
	
	// this method will give object 
	public static  HeavyResource getInstance() {
		
//		if(instance == null) {
//			instance = new HeavyResource() ;
//			
//		}
		return instance ;
		}
	
	
	// there are two kind of singleton class 
	
	// egar   ---- but they will be atuo created without calling them 
	
	/// lazy  ----  those object which will be create when you are calling them  
	
	

}
