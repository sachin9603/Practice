package jul8;

import java.util.HashSet;

public class Demo78 {
	
	public static void main(String[] args) {
		
		
	HashSet<String> set  = new HashSet<>() ;
	
	// it will not allow duplicate value 
	// it will not maintain intersation  order ;
	// it will not allow multiple null value ;
	
	
	set.add("Sachin");
	set.add("Sachin");
	set.add("Sachin");
	set.add("Rahul");
	set.add("pritam");
	
	System.out.println(set);
	}

}
