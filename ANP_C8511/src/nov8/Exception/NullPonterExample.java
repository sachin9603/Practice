package nov8.Exception;

public class NullPonterExample {

	 
	
    public static void main(int s) {
		
		
		System.out.println(s);
		 		
		
		System.out.println("kuch bhi ");
		
	}
   static {
    	System.out.println("I am static block YEsss....");
    }
  
	public static void main(String[] args) {
		
		
		String s = null ;
		
		//System.out.println(s.length());
		System.out.println("1000 line of code is also there after line 11");
		NullPonterExample.main(999999);
		{
			   System.out.println("I am Initilizer Block ");
		   }
		
	}
	
	

}
