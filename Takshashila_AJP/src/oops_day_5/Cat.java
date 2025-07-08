package oops_day_5;

public class Cat extends Animal  {

	
	public void drinkingMilking() {
		System.out.println("yes i will finish it or i will eat rat also ");
	}
	
	public static void main(String[] args) {
		
		Cat dayna = new Cat()  ;
		dayna.drinkingMilking();
		dayna.sound();
		
	}
}
