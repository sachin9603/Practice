package nov20.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {
	
	public static void main(String[] args) {
		
		PrintMachine[] arr  = {
				new PrintMachine ("Sachin" ) ,
				new PrintMachine ("Rohan" ) ,
				new PrintMachine ("Sheetal" ) ,
				new PrintMachine ("Pooja" ) ,
				new PrintMachine ("Himaesh" ) ,
				new PrintMachine ("Mobile" ) 
				
		} ;
		
		
		ExecutorService es = Executors.newFixedThreadPool(3)  ;
		
		
		
		
		for (PrintMachine  obj  :arr) {
			
		es.submit(obj) ; // iski runmethod ko start kardega 
			
		}
		
		es.shutdown();
		
		
		
		
	}

}
