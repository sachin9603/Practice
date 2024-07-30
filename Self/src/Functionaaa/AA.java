package Functionaaa;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class AA {
	
	public static void main(String[] args) {
		List<String> cities = new ArrayList<>();
	    cities.add("Delhi");
	    cities.add("Mumbai");
	    cities.add("Goa");
	    cities.add("Pune");
	    
	    Consumer<String> printConsumer= city-> System.out.println(city); 
	    
	   // cities.forEach(printConsumer);
	   // System.out.println(printConsumer.toString());
	    
	}

}
