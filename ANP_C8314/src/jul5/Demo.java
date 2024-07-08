package jul5;

public class Demo {
	
	
    
    static  void add(int a , int b  , int c ) {// 1000 paramerter dene 
		System.out.println(" three ");

    	int d  = a+b+c ;
    	System.out.println(d);
    }
  
    static void add(int ...a) {// 1000 paramerter dene 
		System.out.println(" tw0oooooooooooo ");

        int ans  = 0  ;
    	for(int ff  : a) {
    		ans = ans + ff  ;
    		
    	}
    	System.out.println(ans);
    	
    	
    }
    static void add(int a , int b ) {
		System.out.println(" two ");
    	int c  =   a+b  ;
    	System.out.println(c);
    }
  
    
    static void add(String ...as ) {
		System.out.println(" two ");
		 String ans  = "" ;
	    	for(String  ff  : as) {
	    		ans = ans + ff  ;
	    		
	    	}
	    	System.out.println(ans);
	    	
    }
  
   
    
    
	public static void main(String ...a) {
		add(12,23 );
		
		add(23,14,5,64,3,2,4);
		
		add("sachin " ,"rahul " ,"kk " , "dj " ) ;
		
	}
	
}
