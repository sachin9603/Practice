package jan30;

public class LoginCheck {
	// ye mthod hai 
	
	public static  boolean EmailCheck(String email) throws CustomInvalidEmailException{
		//sachin@hmail.com
		// mai isme check kar raha hu ki  ek @ toh hai na 
		char[] arrOFCharOFEmail  = email.toCharArray() ; //{s,a,c,h,i,n,@,g,m,a,i,l,.,c,o,m}
		//sachin@gmai@l.com
		int count  = 0  ;
		
		for( char ch :arrOFCharOFEmail) {
			if(ch == '@') {
				count++ ;
				
			}
		}
		if(count != 1) {
			throw new CustomInvalidEmailException("Bhai ek @ aayega  sirf  ");
		}else {
			return true   ;
		}
		
}
	
	
	public static void main(String[] args) {
		// jab isko run karunga tab issue aayega 
		
			try {
				boolean  ans  = EmailCheck("sachinparmar2@@334gmail.com") ;

				System.out.println(ans);
			} catch (CustomInvalidEmailException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("mai hu last line ");
		
		
	}
	
	
	

}
