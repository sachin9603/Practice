package oops;
// it is kind of inforamtion on paper 
public class Laptop {
	
	
	// dimaag mai set of information hai --- ki laptop kesa hota hai 
	// that is blue print for object 
	
	// dikata kesa hai  
	// state 
	
	
	String color  ;
	int weight  ;
	int size ;
	
	String ram  ;
	String rom ;
	String brand   ;
	String model  ;
	
	
	// // functionality kya kya 
	// method 
	

	public void bestGamming()  {
		System.out.println("This is Best gaaming laptop ");
	}
	
	
	
	public void displayInformation()  {
		System.out.println("Brand is "+ brand);
		System.out.println("Model is "+ model);
		System.out.println("Ram  is "+ ram);
		System.out.println("Rom is "+ rom);

		System.out.println(" Size  is"+ size);

	}
	
	
	// default cons
	// constructor   --- it is special method which used to create object of any class 
	// cons are not returning any thing explicitly but they are return oobject of same implicitly 
	
	// default cons --- it will be always there, no matter if you are creating or not 
	// parameterize cons
	
	public Laptop(){
		// when we will create object it will be called automatically  
		System.out.println("This is laptop construcotr being called ");
		
	}

    public Laptop (Laptop object) {
    	this.color = object.color;
		this.weight = object.weight;
		this.size = object.size;
		this.ram = object.ram;
		this.rom = object.rom;
		this.brand = object.brand;
		this.model = object.model;
    }

	public Laptop(String color, int weight, int size, String ram, String rom, String brand, String model) {
		
		this.color = color;
		this.weight = weight;
		this.size = size;
		this.ram = ram;
		this.rom = rom;
		this.brand = brand;
		this.model = model;
	} ;
	
	// but if you creating a parameterize cons. 
	
	// then you must have to create a default cons bcz,
	//when you are creating parameter cons  then at that defalut cons. will get overloaded 
	
	
	
	
	
	public int price()  {
		
		return 50000;
	}
	
	

}
