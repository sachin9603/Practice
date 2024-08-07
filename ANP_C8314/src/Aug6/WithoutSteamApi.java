package Aug6;

import java.util.ArrayList;
import java.util.List;

public class WithoutSteamApi {
	
	
	public static void main(String[] args) {
		
		List<Product> list  = new ArrayList<>() ;
		
		list.add(new Product(1,"jeans1" , 3500 )) ;
		list.add(new Product(2,"top" , 300 )) ;
		list.add(new Product(3,"mixer" , 1500 )) ;
		list.add(new Product(4,"tv" , 2500 )) ;
		list.add(new Product(5,"ipone" , 3500 )) ;
		list.add(new Product(6,"fridge" , 3500 )) ;
		list.add(new Product(7,"car" , 350000 )) ;
		
		
		//chalo mujhe list batao paiso ki jo 3000 uper hai 
		
		ArrayList<Integer> ss  = new ArrayList<>() ;
		
		int sum  = 0  ;
		for(Product p : list) {
			
			if(p.price> 3000) {
				ss.add((int) p.price) ;
				sum += p.price ;
			}
		}
		System.out.println(ss);
		System.out.println(sum);
		
		
		
		
		
		
	}

}
