package jan1;

public class Mutiplecatch {

	
	public static void main(String[] args) {
		
		  try{  
			  
              int a[]=new int[5]; // 0 1 2 3 4   
              a[7]=30/0;    
              
             }    
             catch(ArrayIndexOutOfBoundsException e)  
                {  
                 System.out.println("Array occurs");  
                }    
             catch( ArithmeticException e)  
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
