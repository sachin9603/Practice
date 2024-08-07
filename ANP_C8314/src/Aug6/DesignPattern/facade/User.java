package Aug6.DesignPattern.facade;

public class User {
	public static void main(String[] args) {
		
		
		
		RoomLight rt  = new RoomLight() ;
		Television tt  = new Television () ;
		SoundSystem ss  = new SoundSystem() ;
		HomeThreaterFacade facade  = new HomeThreaterFacade(rt , ss , tt);
		
		facade.watchmovie();
		facade.stopwatching();
		
		
		
		
		
	}

}
