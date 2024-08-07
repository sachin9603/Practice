package Aug6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WithStreamApi {
	

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
		//int sum  =0  ;
//		 .peek(p -> listOfPPrice.add(p.price)) // add to list
//	        .mapToInt(p -> p.price)
//	        .sum();
//		
		List<Integer>  listOfPPrice  = list.stream()
				                      .filter(p -> p.price > 3000)
				                      .map(p -> {
				                    	
				      
				                    	  return (int)p.price  ;
				                      })
				                      .collect(Collectors.toList() );
		
		List<Integer>  listOfPPriceoo  = new ArrayList<>() ;
		
		
		
		Integer  totolSum  = list.stream()
				             .filter(p -> p.price > 3000)
				             .peek(l  -> listOfPPriceoo.add(l.price))
				             .mapToInt(o ->  o.price)
				             .sum() ;
		
		
		System.out.println(totolSum);
		
		
		
		
		System.out.println(listOfPPrice);
		
		
		
		 List<String> strings = Arrays.asList("Hello", " ", "World", "!", "This", " ", "is", " ", "a", " ", "test.");

	        String concatenatedString = strings.stream()
	                .collect(Collectors.joining());
		
		
	}


}
