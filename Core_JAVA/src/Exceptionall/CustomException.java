package Exceptionall;

public class CustomException {
	
	public void giveAdharName(String naam) throws InvalidNameException {
		if (naam.length()< 3) {
			throw new InvalidNameException("sahi naam likho .....") ;
		}
		System.out.println("your name is correct .... ");
	}
	
	
	
	public void giveVote(int age)throws AgeException {
		
		if(age<18) {
			throw new AgeException(" aapki umra 18 saal se kam hai ") ;
		}
		
		System.out.println("aapka vote successfully ho gaya hai ");
		
	}
	
	
	// ese exception jo hum khud se banate ahai -- humari recquirement k hissab se  usnko bolte hai custom exctoion  
	
	
	public static void main(String[] args) {
		CustomException obj  = new CustomException()  ;
		//obj.giveVote(12); you cant write like this because it is giving check excception 
		
		try {
			obj.giveVote(12);
		} catch (AgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("sachin");
		
		try {
			obj.giveAdharName("RJ");	
		
		
	// 2 words se chota hai phir bhi abhi exception ka 
		// notification hai aayga kyuki ye method run exception ko throw kar rahi hai jo bhi code run hone k baad hi pata lagea 
		// aap pehle se isko hadle kar sakte ho sime koi issue nahi hai 
		
		}catch(InvalidNameException kk  ) {
			kk.printStackTrace();
		}
		
		
		
		
		
		System.out.println("neweweww");
		
		
	}
	

}
