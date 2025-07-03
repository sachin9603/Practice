package day_2;

public class Factory {
	
	
	public static void main(String[] args) {
		
		// java object 
		
		
		Suv_Car scorpio001 = new Suv_Car()  ;
		
		scorpio001.colour = "White" ;
		scorpio001.bootspace = 200 ;
		scorpio001.fuel_capacity = 50  ;
		scorpio001.wheel = 4 ;
		
		
		
      Suv_Car scorpio002 = new Suv_Car()  ;
		
		scorpio002.colour = "Black" ;
		scorpio002.bootspace = 200 ;
		scorpio002.fuel_capacity = 50  ;
		scorpio002.wheel = 4 ;
		
		
		 Suv_Car  nexon990 = new Suv_Car()  ;
			
		 nexon990.colour = "TealBlue" ;
		 nexon990.bootspace = 100 ;
		 nexon990.fuel_capacity = 40  ;
		 nexon990.wheel = 4 ;
		
		 
		 System.out.println(nexon990.colour);
		 nexon990.speed();
		 
		 System.out.println(scorpio002.colour);
		 scorpio002.speed();
		 
		 System.out.println(scorpio001.colour);
		scorpio001.speed();
		scorpio001.offRoading();
		
		
		
		
		
		
		
	}

}
