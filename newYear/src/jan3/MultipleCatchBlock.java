package jan3;

public class MultipleCatchBlock {
	
	
	public static void main(String[] args) {
		
		// it is runtime exception that's why  ( unchecked )
		// compiler is not giving any kind of issue at line 10 
		
		try {
		int arr []  = new int[5] ;
			System.out.println(arr[2]);
			try {
				String s  = "ABA" ;
				int n  = Integer.parseInt(s) ;
				n= n + 10  ;
				System.out.println( n);
			}catch(NumberFormatException e) {
				
				System.out.println( "error can't chnage " +e.getMessage());	
			}	
		}catch(ArithmeticException e) {  
            System.out.println("ArrayIndexOutOfBounds Exception occurs");  
           }catch(ArrayIndexOutOfBoundsException e) {  
            System.out.println("ArrayIndexOutOfBounds Exception occurs");  
           }catch(NumberFormatException e)  {  
               System.out.println("NumberFormatException Exception occurs");  
              } catch(Exception e)  {  
                  System.out.println(e.getMessage());  
                 }finally {
                	 System.out.println("now code has been ended ");
                 }
   		
		
		
		System.out.println(" normal baaki ka code ");
		
		
		
//		Why use Java finally block?
//finally block in Java can be used to put "cleanup" code such as closing a file, closing connection, etc.
//The important statements to be printed can be placed in the finally block.		
		
	}

}
