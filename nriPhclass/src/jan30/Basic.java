package jan30;

public class Basic {
	
	
	public static void main(String[] args) {
		
		int a  = 388  ;
		
		int b  =  0 ;
		
		
		
		// vo saare checked exception 
		 //hai jo Exception class k child hai yaa inherit kar rahe hai 
		
		// vo saare unchecked hai jo Runtime class ko inherit kar rahe rhae hai 
		 
		
		
		
		// checked ---- yahi compile  --- mtlab ki likhte vakt hi samjh  aajayega ki  kuch galti hai code mai 
		// unchecked --- runtime exception --- run karunga tab issue aayega 
		int  c  = a/b ;
		 
		System.out.println(c);
		
//		try {
//			
//		}catch(Exception e){
//			
//			System.out.println(e.getMessage());
//		}
		
		HumanBeing sachin = new HumanBeing() ; /// ye obj banane k liye kuch chiye or usi kaa naam hai constructor 
		sachin.Catagoery = "OBC" ; 
		System.out.println(sachin.Catagoery );
		sachin.eat();
		
		HumanBeing Kali  = new HumanBeing (640  , "male" , "Hindu " , "obc") ; // parameter vala constructor yaha use ho rahaha hai
		
		System.out.println(Kali.Catagoery);
	}
	

}
