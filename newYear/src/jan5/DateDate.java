package jan5;

import java.time.*;
import java.time.temporal.*;
public class DateDate {
	
	public static void main(String[] args) {
		
//		DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("dd-MMMMM-yy h:mm:ss");
//		LocalDateTime current = LocalDateTime.now();
//		System.out.println("current date and time in default format: "+ current);
//		String udf= current.format(formatObj);
//		System.out.println("current date and time in userdefined format: "+ udf);

		
		//String s  = 10:40:33 pm
		
//		String sss  = "34234234" ; 
//		
//		int ss  = Integer.parseInt(sss); 
		
		
//		
//		
//		String dob="05/02/1985";
//		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		LocalDate ld=LocalDate.parse(dob,dtf);
//		
//		DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("dd-MMM-yy");
//		String ff = ld.format(formatObj) ;
//		System.out.println(ff);
		
		
//		LocalDate cdate = LocalDate.now();
//		LocalDate dob = LocalDate.of(2000, 04, 6);
//		Period diff = Period.between(cdate, dob);
//		System.out.println(diff);
		
		
		LocalDateTime oldDate = LocalDateTime.of(1982, 5, 31, 10, 20, 55);
		LocalDateTime newDate = LocalDateTime.of(2016, 9, 9, 10, 21, 56);
		System.out.println(oldDate);
		System.out.println(newDate);
		System.out.println(ChronoUnit.YEARS.between(oldDate, newDate) + " years");
		System.out.println(ChronoUnit.MONTHS.between(oldDate, newDate) + " months");
		System.out.println(ChronoUnit.WEEKS.between(oldDate, newDate) + " weeks");
		System.out.println(ChronoUnit.DAYS.between(oldDate, newDate)+ " days");
		System.out.println(ChronoUnit.HOURS.between(oldDate, newDate) + " hours");
		System.out.println(ChronoUnit.MINUTES.between(oldDate, newDate) + " minutes");
		System.out.println(ChronoUnit.SECONDS.between(oldDate, newDate) + " seconds");
		System.out.println(ChronoUnit.MILLIS.between(oldDate, newDate) + " milis");
		System.out.println(ChronoUnit.NANOS.between(oldDate, newDate) + " nano");


		
	}

}
