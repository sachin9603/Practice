package jan4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateAndtime {

	
	public static void main(String[] args) {
		
		// the current date (yyyy-MM-dd) format
		LocalDate date = LocalDate.now();
		System.out.println("the current date is :"+ date);
		
		
		LocalTime time  = LocalTime.now() ;
		System.out.println("the current time is "+ time);

		
		// will give us the current time and date combined with "T"
		LocalDateTime current = LocalDateTime.now();
		System.out.println("current date and time : "+ current);

	}
}
