package oops;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

public class TIMEE {
	
	
	public static void main(String[] args) {
	
		
		 LocalDateTime date = LocalDateTime.now();
		    System.out.println("the current date is "+ date);
		    
		    
		 //   = LocalDateTime.of(2026, Month.SEPTEMBER, 26, 6, 30);
//		    LocalDateTime localDateTime1  =LocalDateTime.parse("2015-02-20T06:30:00");
//		    LocalDateTime localDateTime2  =LocalDateTime.parse("2015-02-20T07:30:00");
//		    LocalDateTime KK  = localDateTime2 - localDateTime1  ;
		    
		    LocalDateTime startDateTime = LocalDateTime.of(2025, 9, 25, 10, 30, 0);
	        LocalDateTime endDateTime = LocalDateTime.of(2025, 9, 26, 14, 45, 30);

	        // Calculate the duration between the two date-times
	        Duration duration = Duration.between(startDateTime, endDateTime);

	        // Get the total difference in various units
	        long totalSeconds = duration.getSeconds();
	        long totalMinutes = duration.toMinutes();
	        long totalHours = duration.toHours();
	        long totalDays = duration.toDays();

	        System.out.println("Total seconds: " + totalSeconds);
	        System.out.println("Total minutes: " + totalMinutes);
	        System.out.println("Total hours: " + totalHours);
	        System.out.println("Total days: " + totalDays);
		    

	}
	

}
