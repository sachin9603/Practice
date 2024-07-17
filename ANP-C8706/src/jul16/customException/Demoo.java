package jul16.customException;

public class Demoo {
	
	public static void ageChecking(int umra) throws InvalidAgeException  {
		
		if(umra >= 18) {
			System.out.println("yes you can vote ");
		}else {
			throw new InvalidAgeException("you are less then 18 so you can't vote ");
		}
		
		
	}
	public static void main(String[] args) {
		
		int age  =  17 ;
		
		
		try {
			
			ageChecking(17) ;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("1000 lines of code ");
		
		  try{    
              int a[]=new int[5];    
              a[8]=30/0;    
              System.out.println(a[10]);  
             }    
             catch(ArithmeticException e)  
                {  
                 System.out.println("Arithmetic Exception occurs");  
                }    
             catch(ArrayIndexOutOfBoundsException e)  
                {  
                 System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                }    
             catch(Exception e)  
                {  
                 System.out.println("Parent Exception occurs");  
                }             
             System.out.println("rest of the code");    
  }  

		
	

}
