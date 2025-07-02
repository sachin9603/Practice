package basicConcept;

import java.util.Arrays;

public class EnumExample {
	
	
	//"enum in Java is a special data type that represents a group of constants. It's like a list of predefined values you can use without creating a class or using a bunch of static variables."
	
	
	public static void main(String[] args) {
		
//		String s = "Ravi" ;
//		
//		Days day  = Days.MONDAY ;
//		
//		System.out.println("Today is " + day);
//		
//		
		
		
//		for (Days d : Days.values()) {
//			System.out.println(d +" have working hours "+ d.getWorkingHours() );
//		}
		
		
		
		Days day  = Days.FRIDAY ;
		
		System.out.println(day.name());
		System.out.println(day.ordinal());
		System.out.println(day.valueOf("MONDAY"));
		System.out.println(Arrays.toString(Days.values()));
		
		
		
	}
	
	
	//"Enums provide type safety, avoid bugs from invalid values,
	//and are more readable. Instead of passing a string like “Monday”, 
	//you pass Day.MONDAY, which the compiler checks for you."
	
	
	
	
	
	
	}
