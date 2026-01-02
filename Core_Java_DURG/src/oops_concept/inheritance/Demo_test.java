package oops_concept.inheritance;

public class Demo_test {
	
	
	//// encapsulation  , inheritance , polymorphism(runtime , complie time also )
	
	public static void main(String[] args) {
		
		Dog d  = new Dog() ;
		
		d.Bark();// dog 
		d.eat();// animal 
		
		BabyDog  baby = new BabyDog()  ;
		baby.Bark();
		baby.eat();
		baby.weeping() ;
		
		
		
		// multiple inheritance is not posible in java bcz of there would be amibiguity issue 
		
		/// do chije ka ek hi amtlab ho jaata haai tab ambiguity hota hai jese ki sona --- sleep,  gold
		
	
	}

}
