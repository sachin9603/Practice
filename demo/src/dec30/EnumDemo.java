package dec30;

public class EnumDemo {
	
//our school is situated in the center city
  
	static String studentsHomeDirection  = "Tanki ki paas" ;
	
	Directions ro = Directions.EAST;
	
	
	public static void main(String[] args) {
		System.out.println(EnumDemo.studentsHomeDirection);
		//System.out.println(EnumDemo.studentsHomeDirectionRightOne);
		
		EnumDemo sss = new EnumDemo() ;
		System.out.println(sss.ro);
		
		System.out.println(Directions.valueOf("NORTH").ordinal());
		
	
//		
//		for(Directions d : Directions.values()) {
//			System.out.println(d);
//		}
//		
		
		
		DAY holiday  = DAY.SUNDAY;
		
		System.out.println(holiday);
		
		
		for(DAY d : DAY.values()) {
			System.out.println(d +"--- >" +d.values());
		}
		
		 
		
	}
	
	
}
