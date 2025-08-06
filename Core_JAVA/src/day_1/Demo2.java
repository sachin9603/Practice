package day_1;

public class Demo2 {
	
	
	public static void main(String[] args) {
		
		int j  = 10  ;
		
		// j = j + 80  ; //90
		
	      j  += 80  ; //  90
		
		System.out.println(j);
		
		
	//	=, +=, -=, *=, /=, %=
		
		j -= 5 ; // j = j- 5  ;
		
		
		if(j != 90) {
		System.out.println("yes it is correct ");	
		}else {
			System.out.println("it is not correct ");
		}
		
		// && AND and operator yadi ek bhi condition false hai toh it will return false 
		//|| or agar ek bhi condition true hai toh it will return true 
		
		
	 boolean k  = true  ;
	 boolean jk  = false  ;
	 
	 if(k && jk) {
		System.out.println("yes it working");
	 }else {
		 System.out.println("it is not working ");
	 }
	 
	 /// statement
	 
	 int age   = 8  ;
	 
	 if (age >=  18) {
		 System.out.println("yes you can give vote ");
	 }else if (age > 5 && age <18 ) {
		
		System.out.println("you have to go school");
	 }
	 else {
		 System.out.println(" plz ghar raho ");
	 }
	 
	 
	int day  = 50  ;
	
	if(day == 1) {
		System.out.println("Monday");
	}else if (day == 2) {
		System.out.println("Tuesday");
	}else if (day == 3) {
		System.out.println("Wednesday");
	}else if (day ==4) {
		System.out.println("Thrusday");
	}else if (day == 5) {
		System.out.println("Friday");
	}
	
	
	// Switch statement 
	
	
	switch(day) {
	
	case 1 :
	
	System.out.println("Monday");
	break ;
	
	case 2 :
		
	System.out.println("Tuesday");
	break ;
	
	case 3 :
		
	System.out.println("Wednesday");
	break ;
	
	case 4 :
		
	System.out.println("Thrusday");
	break ;
	case 5 :
		
	System.out.println("Friday");
	break ;
	default  :
		System.out.println("you have entered wrong day ");
	
	
	}
		
		
		
		
		
		
		
	}

}
