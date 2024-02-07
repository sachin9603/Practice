package jan29;

import java.util.Scanner;

public class Loginkaro {
	
	
	public static void login( String d  ,String password ) throws LoginXYXXXXException {
		String  id   = "sachin123";
		String  pass = "qwerty" ;
		
		
		if ((id.equals(d) )&&(password .equals(pass)) ) {
			System.out.println("you are login success fully ");
		}else {
			throw new LoginXYXXXXException("galat hai  aapke id  password ") ;
			
		}
	}
	public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in) ;
	
	String iddd  = sc.nextLine() ;
	
	
	String Sppp = sc.nextLine() ;
	
	
	
	try {
		login(iddd , Sppp) ;xxxxx
	} catch (LoginXYXXXXException e) {
		// TODO Auto-generated catch block
		System.out.println( e.getMessage() );
		

	}
	
	
	
	
		
	}

}
