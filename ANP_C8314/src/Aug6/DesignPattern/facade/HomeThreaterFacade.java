package Aug6.DesignPattern.facade;

public class HomeThreaterFacade {
	
	RoomLight  roomlight ;
	SoundSystem soundSystem ;
	Television television  ;
	
	
	public HomeThreaterFacade(RoomLight roomlight, SoundSystem soundSystem, Television television) {
		super();
		this.roomlight = roomlight;
		this.soundSystem = soundSystem;
		this.television = television;
	}
	
	public void  watchmovie() {
		roomlight.lightDim(); 
		television.switchOnTv();
		soundSystem.switchOnSoundSystem();
	}
	
	
	public void stopwatching() {
		roomlight.lightBright();; 
		television.switchOffTv();
		soundSystem.switchOffSoundSystem();
	}
	
	

}
