package sep18.thread.ExecutorThreadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	
	
	public static void main(String[] args) {
		
	   PrintingName []arrOfPrint  = {
			   new PrintingName("sachin") , new PrintingName("priya"),
			   new PrintingName("Rahul") , new PrintingName("Suresh"),
			   new PrintingName("Ankana") , new PrintingName("Rakehs"),
			   new PrintingName("VAnsh") , new PrintingName("David"),
			   new PrintingName("Dainy") , new PrintingName("Shadhe")
			   } ;
	   
	   
	   ExecutorService sevice = Executors.newFixedThreadPool(3) ;
	   
	   for( PrintingName  oo :arrOfPrint) {
		   sevice.submit(oo) ;
	   }
	  
	   
	   
	   sevice.shutdown();
	   
	   
	}

}
