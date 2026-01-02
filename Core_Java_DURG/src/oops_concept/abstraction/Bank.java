package oops_concept.abstraction;

public abstract class Bank  {
	
	String acc ;
	
	
	//abstract method 
	
	// abstraction ---- hiding implementation part and shoing fucntionlity 
	
	public abstract void  intrest();
	
	// concerete method 
	
	public void bankLogo() {
		
		System.out.println("BOI LOGO");
	}
	
	
	public Bank() {
		this(12121334.42);
		System.out.println("Bank is getting called ");
	} ;
	
	public Bank(int no) {
		
	}
	
	
	private Bank(double money) {
		System.out.println("total money " +money);
	}

}
