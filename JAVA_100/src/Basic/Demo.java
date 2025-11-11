package Basic;

public class Demo {
	
	
	public static void main(String[] args) {
		
		int age  =18  ;
		
		if(age>=18) {
		System.out.println("Yes you can vote ");
	  }else if(age>= 5 && age<18) {
		  System.out.println("you have to focus on study");
	  }else {
		  System.out.println("you have to stay at home ");
	  }
		
		
		int day = 5  ;
		
		if (day == 1) {
			System.out.println("Mon");
		}else if (day == 2) {
			System.out.println("tue");
		}else if (day == 3) {
			System.out.println("wed");
		}else if (day == 4) {
			System.out.println("thrus");
		}else if (day == 5) {
			System.out.println("fri");
		}else if (day == 6) {
			System.out.println("sat");
		}else if (day == 7) {
			System.out.println("sun");
		}else  {
			System.out.println("kinldy enter correct day ");
		}
		
		
		switch(day) {// int, string, char, enum 
		
		case 1: 
			System.out.println("mon");
			break ;
		case 2: 
			System.out.println("tue");
			break ;
		case 3: 
			System.out.println("wed");
			break ;
		case 4: 
			System.out.println("thru");
			break ;
		case 5: 
			System.out.println("fri");
			 
		default :
			System.out.println("Enter correct day ");
			break ;
			
		}
		System.out.println("out of block ");
	}

}
