package oct24.CustomExcetpion;

import java.util.Scanner;

public class Voting {
	
      public  boolean ageValidator(int age ) throws AgeException{
    	  
    	  if(age<= 18) {
    		  
    		  throw new AgeException(" your age is not Valid ");
    		  
    		//System.out.println("Not Eligible");  // is msg ki bajay ,, aapko ek AgeException Dena 
    	  }else {
    		 System.out.println("yes you are Eligible");
    		 return true ;
    	  }
    	  
    	//  return false  ;
    	  
    	  
      }
	
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in) ;
		
		int age  = sc.nextInt() ;
		
		Voting v  =new Voting()  ;
		
		v.ageValidator(age);
		
		
		try{
			if(v.ageValidator(age)) {
				System.out.println("yes you can vote ");
			}		} catch (AgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		;
		}
		
		
		
	}
	

}
