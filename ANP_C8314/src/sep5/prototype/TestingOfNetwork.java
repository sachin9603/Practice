package sep5.prototype;

import java.util.ArrayList;
import java.util.List;

public class TestingOfNetwork {
	
	
	public static void main(String[] args) {
		
		
		
		
		NetworkConnection  networkConnection  = new NetworkConnection () ;
		networkConnection.setIp("232.3323.434.6"); 
		
		networkConnection.loadIMPData(); 
		System.out.println(networkConnection);
		
		
		List<String> list = new ArrayList<>() ;
		
		list.add("www.facebook.com") ;
		list.add("www.bookface.com") ;
		list.add("www.x.com") ;
		
		
		
		networkConnection.setDomains(list);
		
		
		try {
			NetworkConnection  pp  =(NetworkConnection)networkConnection.clone() ;
			
			
			System.out.println(	pp.getIp());
			System.out.println(pp);
				networkConnection.setIp("000000");
			System.out.println(pp.getIp());
			
			networkConnection.getDomains().add(0, "sachin");
			
			System.out.println(pp.getDomains().get(0) );
			// Shallow copy or deep copy  
			
			
	
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}

}
