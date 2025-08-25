package Statementsss;

import java.util.Arrays;

public class Main {

	
	public static void main(String[] args) {
		
		// if esle  switch 
		
		int age  = 3  ;
		
		if(age >= 18) {
			
			System.out.println("you can vote ");
			// this block of code will get run  
			
		}else if (age <= 18 && age > 5) {
			
			System.out.println(" you have to study ");
			
			// if condition is not true then ye block chalega 
		}else {
			System.out.println("just chill ");
		}
		
		
		
		// switch statement is faster than if else 
		int day  = 3  ; // tue
		
		switch(day) {
		
		
		case 1: 
			System.out.println("MON");
			
			break ;
			
		case 2: 
			System.out.println("tue");
			
			break ;
		case 3: 
			System.out.println("wed");
			
			break ;
			
		case 4: 
			System.out.println("thrus");
			
			break ;
		case 5: 
			System.out.println("friday");
			
			break ;
			
			default :
				
				System.out.println("you have entered wrong value ");
			
		}
		
		
		
        Directions dd  = 	Directions.EAST ;
        
        Directions [] arr  =     Directions.values() ;
        
        System.out.println(Arrays.toString(arr));
        
        
		
		
	}



}
