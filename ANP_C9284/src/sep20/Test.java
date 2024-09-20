package sep20;

public class Test {
	
	public static void main(String[] args) {
		Shape cir  = new Circle() ;
		
		cir.shaping();
		
		Shape cirr = new Shape (){
			
			public void shaping() {
				// TODO Auto-generated method stub
				System.out.println("I am shaping  new Circle ");
				
			}
		} ;
		cirr.shaping();
		
		
   Shape cirr1 =   () -> System.out.println("I am shaping  new Circle ");
				 
		cirr1.shaping();
		
		Student random  = new Student() ;
		
		
		Shape obj  = random::koiEkHai ;
		
		obj.shaping();
		
		Shape obje = Student:: koiEkHaiStatic ;
		
		obje.shaping();
		
		
		
		
		
	}

}
