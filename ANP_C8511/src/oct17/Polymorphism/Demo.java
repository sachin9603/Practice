package oct17.Polymorphism;

public class Demo {
	
	
	public int add(int a  , int b) {
		
		int sum  = a+ b ;
		System.out.println(sum);
		return sum ;
		
	}
	public void add(String a  , int b) {
		String  sum  = a+ b ;
		System.out.println(sum);

		
	}
	
	public int add(int a  , int b  , int c) {
		int sum  = a+ b+ c ;
		System.out.println(sum);
		return sum ;
		
	}
	

	public static void main(String[] args) {
		
		//poly + morphism ---- ek hi function ko multiple form mai use karna is poly morphism
		
		///method overloading    , method overriding 
		
		
		Demo  d1  = new Demo() ;;;
		
		
		d1.add(45, 90) ;
		d1.add(8, 12, 4);
		d1.add("Sachin",10) ;
		
		/// compiletime --- Polymorphism 
		
		// var-args  in java 
		
		
		
		Employee kk  = new Developer() ;
		Employee k  = new Employee() ;
		
		kk.salary(); // this is example of Runtime polymorphism 
		k.salary(); 
		
		
		
	}

}
