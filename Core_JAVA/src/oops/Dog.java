package oops;
// dog is  child classs or sub class of animal class
public class Dog extends Animal{
	
	
	 
	Dog() {
		// lekin jab bhi chid ka constructor banate ho isme aumatic ek super keyword likha hai 
		super();// ye super parent k default contructor ko dhund raha hai 
		
		
	}
	
	public void bark()  {
		System.out.println("Dog is barking ");
	}
	
	
	
	 // yaha par koi eating method nahi hai 4
		
		
	// when we are  useing same method of parent into child tab app method signature change nahi kar sakte hai 
		
	
	@Override
	public void eating()  {
		System.out.println(" Dog is eating bones  ");
	}

}
