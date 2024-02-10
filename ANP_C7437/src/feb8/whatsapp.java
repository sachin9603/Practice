package feb8;

public abstract  class whatsapp {
	
	
	// abs class mai aap abstract method 
	
	public  abstract void sendMessage() ;

	
	// concrete method
	public void icon() {
		System.out.println("hara color ");
	}
	
	
	public static void status() {
		System.out.println("sachn k saare status aagye hai samne ");
	}
	
	
	// chhe is class ka obj nahi banega but iska contructor present hai 
	
	// vo kyu hai kyuki jab aap child class k consttuctor banaoge  tab is cons. first  key word by default 
	// super() or iska matlab hai ki prent k constor ko call kar rhaha hai 
	// isisliye is class mai const. hoga hi 
	
	
	// is there is private cont. in abs class
	
	
	//yes hai 
	
	
	private whatsapp(int seepd) {
		System.out.println("meri speed hai  "+ seepd );
	}
	
	public whatsapp() {
		this(230) ; // this.name  = name  ;
		
		System.out.println("mai hu abs clas ka constructor ");
	}
	
	
	
	
	
}
