package day2;

public class Demo_2 {
	
	{
		
	}
	
	
	// this will be ignore by compiler 
	
	/*
	 * asdfaasdf
	 * asdf
	 * asdf
	 * asdf
	 */
	public static void main(String[] args) {
		
	System.out.println("Welcome to core java Training by Ibm Skill builds ");
	
// datatype  varible name   assigning operator   	value or literal 
	int       s                  =                        14  ;
	// integer  ---- int short  byte long 
	byte  ll  = 10 ;
	short kk  = 89 ;
	int uu  = 478799785  ; // -2,147,483,648 to 2,147,483,647.
	long oo  = 95 ;// - 9,223,372,036,854,775,808 to 9,223,372,036,854,775,807. 
	char hj = 64 ;
	// floating value ---- 
	float jk  = 7899.45f ;
	double kl = 878744984.544 ;
	/// boolean data 
	boolean jh  = true  ;
	
	
	 // there are 8 primitive data type in java 
	// is java is 100 % object oriented language  -- No 
	
	// because java have primitive data type and primitive data type are not assosiat with any object 
	
	String aa  = "Welcome home " ;
	
	String AA = "Wome " ;
	
	int tt  = 56   ;// primitive data type 
	
	Integer hg  = 56  ; // ek object hai Integer class ka but kaam sam kar raha ahai 
	
	Short jkjk  = 89  ;
	
	
    
	
	Integer ee  = new Integer(45)  ;
	Integer aq = 50;
	
	Short k  = 45 ;
	Byte l =56 ;
	
	Long la  = 456L ;
	Double mm  = 45.56 ;
	Boolean gh  = true ;
	Character mn = 'c' ;
	
	Integer aad  = Integer.MAX_VALUE ;
	
	int maxVal = Integer.max(79879, 5465);
	System.out.println(maxVal);
	
	
	System.out.println(aad);
	Byte xn  = Byte.MAX_VALUE ;
	System.out.println(xn);
	
	/// key words 
	
	
	
	
	///+, -, *, /, %, ++, --
	
	
	
	 int num = 162314658 ;// sum of all even number into this 
	    
	    //162314658 =  162314658/10 , rem --8
	    
	
//	  int sum = 0  ;
//	    while(0 > num) {
//	        int digit = num % 10;  
//	        if (digit % 2 == 0) {  // 
//	            sum += digit; 
//	        }
//
//	     }
//	    System.out.println(sum)


		System.out.println("=========================================");
	// //162314658 =  162314658/10 rem -- 8, 162314658/10 == 16231465
	    
		 int evenSum=0;
	        while(num>0){
	            int rem = num%10;
	            if(rem%2==0){
	                evenSum +=rem;
	            }
	            num = num/10; //is step mai  last number delete ho raha hai 
	            
	        }
	        System.out.println("Even sum = "+evenSum);
	    }
	
	
	
	
	
	
	
	
	
	
			
	
	
	
	
	

}
