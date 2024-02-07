package jan17;

public class Dog extends Animal {
	
	// @Override isaliye lagate hai taaki method signature parent class k method signature jesa ho 
	//  or aap method k ander ki chije yaani implimetation change kar skte ho 
	
	
	
	@Override
	 public void sound(){
		
			System.out.println("Dogs are barking...... ");
			
			System.out.println("babyDogs are weeping...... ");
		}
	
	public static void main(String[] args) {
		
		Dog d  = new Dog () ;
		
		Animal aaa = new Animal() ;
		
		aaa.sound();
		
		d.sound();  // kya yaha par mujhe pata chal gaya hai kya ki sound kya print karega 
		
		
	//	mujhe pata hai  chal raha hai jab mai run kar raha hu 
		
		
	}

}
