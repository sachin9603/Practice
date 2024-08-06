package AUG1.Consumer;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class MAinTest1 {
	
	public static void main(String[] args) {
		
		
		   Consumer<String> consumer1   = ConsumerInterfaceExample :: doingSomeOperation;
		   
		   consumer1.accept("RAM" );
		   
		   Consumer<Integer> consumer12   = ConsumerInterfaceExample :: doingSomeOperation;
		         consumer12.accept( 13 );
		         
		         //BinaryOperator<T>
		         
		         Supplier s  = ConsumerererImpl :: supplierMethod ;
		         
		       System.out.println(s.get());  
		       
		       
	     Runnable a  = new Runnable() {
	    	 
		    	    public void run() {
		    		   System.out.println("I am from Runnable Interface Anonymous class ");
		    	   }
		       } ;
		   
		   Thread t1  = new Thread(a) ;
		   
		   t1.start();
		   
		   
//		   ThreadAA  oo = new ThreadAA() ;
//		   
//		   Thread cc = new  Thread(oo) ; 
//		   
//		   
//		  cc.start();
//		   
		   
		   
	}

}
