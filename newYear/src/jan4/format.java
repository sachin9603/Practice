package jan4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class format {

   public static void main(String[] args) {
	   LocalDate ld=LocalDate.now();
	   LocalDate dd= ld.plus(3, ChronoUnit.MONTHS);
	   System.out.println(dd);
   }}
