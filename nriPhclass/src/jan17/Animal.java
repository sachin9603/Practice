package jan17;

public class Animal {
	
	
	// what is run time polymorphism 
	//31 march is - time pura backend complete krvana hai 
	
	
	int legs = 4  ;
	
	
	 public void sound() {
		System.out.println("all animals have some sound ......");
	}
	
	 
	 // dono chije same hai compile time polymorphism  (overloading )
	 
	 public int  add(int a , int b ) {
		 
		 return a+b ;
		 
		 
	 }
	 
   public int  add(int a , int b , int c ) {
		 
		 return a+b+c ;
		 
		 
	 }
   
   // same classs mai same method name hai and no of argument
   //change hai is scenario  method ko overload karva dena method 
   
	

}
