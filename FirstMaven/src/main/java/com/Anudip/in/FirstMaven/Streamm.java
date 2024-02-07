package com.Anudip.in.FirstMaven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamm {

	
	public static void main(String[] args) {
		
		List<Integer>   list1   = new ArrayList<>() ;
		   
		
		List<Integer> List3  = List.of(23,53,25,35,5,6,6);
		 
		List<Integer> list2   = Arrays.asList(23,45,5,32,42,2) ;
		// without strbefore 1.8 \
		
		
		Stream<Integer> strream  = list2.stream() ;
		
		
		
		List<Integer>  newEvenList  = strream.filter(i -> i%2 == 0).collect(Collectors.toList()) ;
		
		System.out.println(newEvenList);
		
		
		
		
		
		
		
		
		
	}
	
	
}
