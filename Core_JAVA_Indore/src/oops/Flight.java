package oops;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Locale;

public class Flight {
	
	
//	flightNumber, airline, source, destination, fare.
	
	private String flightNumber ;
	//
	private String  airline  ;
	
	private String source  ;
	private String destination ;
	private double  fare ; //4215.20
	
	
	
//	LocalDateTime startDateTime = LocalDateTime.of(2025, 9, 25, 10, 30, 0);
//    LocalDateTime endDateTime = LocalDateTime.of(2025, 9, 26, 14, 45, 30);

	public void getDuration(LocalDateTime takeOFF ,LocalDateTime landing)  {
		
        // Calculate the duration between the two date-times
        Duration duration = Duration.between(takeOFF, landing);

        
        long totalHours = duration.toHours();
        
        System.out.print("Your joureny took this many hours ");
        System.out.println("Total hours: " + totalHours);
        
	}



	public String getFlightNumber() {
		return flightNumber;
	}



	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}



	public String getAirline() {
		return airline;
	}



	public void setAirline(String airline) {
		this.airline = airline;
	}



	public String getSource() {
		return source;
	}



	public void setSource(String source) {
		this.source = source;
	}



	public String getDestination() {
		return destination;
	}



	public void setDestination(String destination) {
		this.destination = destination;
	}



	public double getFare() {
		return fare;
	}



	public void setFare(double fare) {
		this.fare = fare;
	}



	public Flight(String flightNumber, String airline, String source, String destination, double fare) {
		super();
		this.flightNumber = flightNumber;
		this.airline = airline;
		this.source = source;
		this.destination = destination;
		this.fare = fare;
	}



	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", airline=" + airline + ", source=" + source + ", destination="
				+ destination + ", fare=" + fare + "]";
	}



	public Flight() {
		super();
	}
	
	
	
	


}
