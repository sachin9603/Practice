package Sep2.FacadeLayer;

public class User {
	
	public static void main(String[] args) {
		
		RoomLight rm   = new RoomLight() ;
		
		SoundSystem sound  = new SoundSystem() ;
		
		Television tv = new Television() ;
		
		
		HomeThreaterFacade homeThreater  =   new HomeThreaterFacade(tv  , sound  , rm  ) ; 
		
		homeThreater.watchMovie(); 
		homeThreater.stopwatching();
		
		
		
		
		
		
		
		
	}

}
