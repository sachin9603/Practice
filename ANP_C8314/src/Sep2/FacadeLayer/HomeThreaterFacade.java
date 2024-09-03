package Sep2.FacadeLayer;

public class HomeThreaterFacade {
	
	Television  tv  ; 
	SoundSystem sound ;
	RoomLight rl ;

	public HomeThreaterFacade(Television tv, SoundSystem sound, RoomLight rl) {
	
		this.tv = tv;
		this.sound = sound;
		this.rl = rl;
	}
	
	
	
	public void watchMovie() {
		tv.switchON(); 
		sound.soundOn(); 
		rl.lightOff(); 
		
	}
	
	public void stopwatching() {
		
		rl.lightOn(); 
		sound.soundOff(); 
		tv.switchOff();
	}
	

}
