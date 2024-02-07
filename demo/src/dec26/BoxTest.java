package dec26;

public class BoxTest {

	public static void main(String[] args) {
		
		
		Box b  = new Box () ;// by default 
		
		Box b2  = new Box(2, 4,5) ;
		
		System.out.println(b2.h);
		
		System.out.println();
	
		
	// java -----
		
	// JDK --- java development kit
		
	 
	 
		// is line ko likte ye fix ho gaya tha ki i am calling single parameter constructor 
		
		Box cube  = new Box(5) ;
		
		int vol  =  cube.volume();
		
		System.out.println(vol);
		
		
	
		
		
		
		
		
		
		
	}
}
