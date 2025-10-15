package day2;

public class Operatorss {

	
	
	public static void main(String[] args) {
		//+, -, *, /, %, ++, --
		
		int a = 10  ;
		int b =  3  ;
		
		int c = a + b  ;
		System.out.println(c);
		  
		// % -- it will give you reminder after divide 
		
		int dd  = a%b ;//1
		
		System.out.println(dd);
		
		int uu = 8898 ;
		
		if(uu%3 == 0) {
			System.out.println("this number is 100% divisible by 3");
		}
		
		// ++ --
		
//		a++ ;    post increment (pehle operation hoga than value badegi 1 se)
//		++a   ;  preincrement (pehle value badadeta hai then operation karega )
	// a-- post decrement 	
		// a++ pre decrement
		// 10     10    11    9     10    10
		int ff  = a++ + a-- + --a + ++a + a++ ;
		
		
		System.out.println(ff);//50
		System.out.println(a); //11
		
		int aa=5;
		                /// 4     3      4   - 4     2  2       2     2 
	    System.out.println((--aa+--aa)*(++aa-aa--)+(--aa+aa--)*(++aa+aa++));
	    System.out.println(aa);
	    
	    
	    
		
		/// =, +=, -=, *=, /=, %=
	    
	    
	    int ll = 5  ;
	   
	    ll += 11 ;//   ll += 10
	    System.out.println(ll);
	    
	    int u = 5  ;
	    u -= 2 ;// u = u-2 
	    
	    u *= 3 ; //9
	    u = u + 6 ;
	    System.out.println(u);
	    
	    
	    //==, !=, <, >, <=, >=
	    
	    
	    if(ll !=  u ){
	    System.out.println("Equal ");	
	    }else {
	    	System.out.println("not equal ");
	    }
	    
	    
	    if(ll >  u ){
	    System.out.println(0.2);	
	    }else {
	    	System.out.println();
	    }
	    
	    String s  = "newKEy" ;
	    Boolean jk  = true ;
	    int kjk  =90 ;
	    
	    boolean  mn = true ;
	    
	    
	    		System.out.println(true);
	    ///&&, ||
	    
	    if( ll == 16 &&  u ==15 ) {
	    	System.out.println("both statement are true ");
	    }
	    
	    
	    
	    Human kkk = new Human()  ;
	    
	    kkk.ear = 2 ;
	    kkk.eye  = 3  ;
	    kkk.leg = 2  ;
	    
	    System.out.println(kkk);
	    
	    
	    /// byte  , short int long 
	    
	    // chote data type ko bade type mai covert kardiya 
	    // widing of data tye ,, it is done imicitly by comilper
	    byte  ii = 90  ;
	    
	    int  rk = ii  ;
	    
	    System.out.println(rk);
	    System.out.println();
	    
	    int hn = 126  ;
	    byte bn  = (byte) hn ;
	    
	    System.out.println(bn);
	    
	    
//	    Statement is the collection of expressions.
//	    To design java applications JAVA has provided the following statements.
//	    
//	    2. Conditional Statements:
//	    	if, if-else, switch
	    
	    
//	    	3. Iterative Statements:
//	    	for, while, do-while
	    
	    int age  = 18  ;// this is a simple expression 
	    
	    if (age >= 18) {
	    	System.out.println("yes you can vote ");
	    }else {
	    	System.out.println("you can't vote ");

	    }
	    
	    
	    if (age >= 18) {
	    	System.out.println("yes you can vote ");
	    }else if(age < 18 && age>5) {
	    	
	    	System.out.println("sirf padai karo only ");
	    	
	    }else {
	    	System.out.println("you can't vote ");

	    }
	    
	    
	    
	    int day  = 51  ;
	    
	    
	    if(day == 1) {
	    	System.out.println("monday ");
	    }else if(day == 2) {
	    	System.out.println("tue ");
	    }else if(day == 3) {
	    	System.out.println("wed ");
	    }else if(day == 4) {
	    	System.out.println("trus ");
	    }else if(day == 5) {
	    	System.out.println("fri ");
	    }
	    
	    switch(day) {
	    
	    case 1 :
	    	System.out.println("monday ");
	    	break;
	    case 2 :
	    	System.out.println("tue ");
	    	break;

	    case 3 :
	    	System.out.println("wed ");
	    	break;

	    case 4 :
	    	System.out.println("trus ");
	    	break;

	    case 5 :
	    	System.out.println("frid ");
	    	break;

	    case 6 :
	    	System.out.println("sar ");
	    	break;

	    	
	    	default :
	    		System.out.println("galat value hai ");
	    	
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    ///
	    
	    
	   
	    
		
		
	}
}
