package jul12;

public class Mobile {
	
	int megapx ;
	String displayType  ;
	int battery  ;
	double price  ;
	
	
	public  Mobile() {}


	public Mobile(int megapx, String displayType, int battery, double price) {
		
		this.megapx = megapx;
		this.displayType = displayType;
		this.battery = battery;
		this.price = price;
	} ;
	
	
	
	public void installapps () {
		System.out.println("aaps are getting ");
	}
	
	
	public int calculation(int a  , int c  , int b) {
		
		return a+b+c ;
		
		
	}
	
	

}
