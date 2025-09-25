package oops;

public class Demo {

	
	// oops  --- object oriented programming
	
	// jisme sab kuch hi object ho  
	// 
	
	
	public static void main(String[] args) {
		
		System.out.println("before object");
		Laptop l1  = new Laptop()  ;
		
		System.out.println("After object ");
		l1.brand  = "asus";
		l1.color = "black" ;
		l1.model = "Vivo book 5  " ;
		l1.ram  = " 8 gb" ;
		l1.rom  = "1 tb" ;
		l1.size  = 12 ;
		// when i created a latop object 
		
		Laptop l2  = new Laptop()  ; // it is object of laptop class  and it is created by default con. 
		
		l2.brand  = "Dell"; 
		l2.color = "silver" ;
		l2.model = "k 5  " ;
		l2.ram  = " 8 gb" ;
		l2.rom  = "1 tb" ;
		l2.size  = 14 ;
		
		
		Laptop l3  = new Laptop("Silver" , 2 , 12 ,"8 gb" , "1 tb " , "Dell" , "latitude");
		
		l3.displayInformation();
		
		
		l2.displayInformation();
		l2.bestGamming();
		
		
	Integer p = l2.price();
	System.out.println(p);
	
	
	Laptop objjj  = new Laptop()  ;
	System.out.println(objjj.getClass());
	
		
	System.out.println(l2);
		
	
	Laptop nLaptop  = new Laptop(l2) ;
	
		
		System.out.println(nLaptop);
		
		
		
		
		
		
	}
}
