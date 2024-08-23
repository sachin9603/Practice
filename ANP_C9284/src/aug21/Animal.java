package aug21;

public class Animal {
	
	public void eat() {
		System.out.println("eating something");
	}
	
	
	
	
}

class Dog extends  Animal{
	
	public void sound() {

		System.out.println("barking .....");
		
		
	}
	
}

class BabyDog extends Dog { 
	
    public void weep() {
		System.out.println("weeping ");
	}
	
	
}
