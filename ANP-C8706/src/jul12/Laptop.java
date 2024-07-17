package jul12;

public class Laptop {
	
   String companyName ;
   String model  ;
  double price  ;
	  
	public Laptop(String companyName, String model, double price) {
		
		this.companyName = companyName;
		this.model = model;
		this.price = price;
	}
	
	public Laptop() {}

	@Override
	public String toString() {
		return "Laptop [companyName=" + companyName + ", model=" + model + ", price=" + price + "]";
	} ;

  
  
  
	public void installIDE() {
		System.out.println("installing ide");
	}
	
	
	public static void main(String[] args) {
		
		Laptop  pp  = new Laptop() ;
		
		pp.companyName  = "asus" ;
		pp.model = "vivobook" ;
		pp.price  = 343400 ;
		
		System.out.println(pp);
		pp.installIDE();
		
		
		Laptop kk = new Laptop( "dell" , "i7" , 80000 ); 
		
		System.out.println(kk);
		
		
	}

}
