package jan31;

public class Human extends Animal{
	
	void eat (String f) {
		System.out.println("i will eat " +f  +" and also waste ");
		
	}

	
	public static void main(String[] args) {
		
		Human a = new Human() ;
		a.eat("roti and sabji ");
		
	}
}
