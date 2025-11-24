package Exceptionn_handling;

public class CustomException {
	/// jo hum khub banate hai exception 
	
	public void run ()  {
		System.out.println("I am running  ");
		
		run()  ;
		
	}
	
	public void validateAge(int age) throws AgeException {
		
		if (age<18) {
			throw new AgeException("you are under age")  ;
		}else {
			System.out.println("Congratulation👌👌👌! you can vote");
		}
	
		
	}
	
	public static void main(String[] args) {
		
		CustomException obj  = new CustomException()  ;
		
		try {
			obj.validateAge(15) ;
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("LAst Line");
		
		
	  try {
		 int i = 4 ;
		 int[] arr  = new int[5] ;
		 arr[11] = i/0 ;
		 
		 }catch (ArrayIndexOutOfBoundsException ee) {
			 ee.printStackTrace();
		 }catch(ArithmeticException e ) {
			 e.printStackTrace();
		 }catch (Exception e1) {
			 e1.printStackTrace();
		 }
		
	  System.out.println("Very Last");
	  
	  
	  
	  // nested jab bhi aata hai matlab ki 
	  // if block k ander if --- nexted if 
	  
	  
	  try {
		
		try {
		int a  = 2 /0 ;	
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}
		  
		  
	  }catch (Exception e ) {
		  e.printStackTrace();
	  }
		
	  
	 // suppose there is some line of code that must be run  
	  // finally block is introduce to close some most imp resource in which we have 
	  
	  try {
		 // kab nahi chalta hai finally block 
		  // System.exit(0)
		
		  // yaa phir is try block mai enter hi nahi kar paya 
		  

//		  CustomException  objj = new CustomException()  ;
//		  
//		  objj.run();
		  
		  return ;
		  
		  
	  }catch (Exception e) {
		  
		  e.printStackTrace();
		  
	  }finally {
		  
		  // ye vo block hai jo exception aaye yaa na aaye 
		  // chaahe return likha ho 
		  //chahe break likha ho 
		  // ye block humesha run hoga 
		 System.out.println("I am Finallly "); 
	  }
		
		
		System.out.println("Sachin after finally ");
	}
	

}
