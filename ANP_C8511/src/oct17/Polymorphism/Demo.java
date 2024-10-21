package oct17.Polymorphism;

public class Demo {
	
	//
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
	
	
	public int add(int  ... a ) {
	//	d1.add(1,34,56,78,90,76);

		// a is not int type but it is array of integer
		int sum  =  0  ;
		
		for (int  i =0  ;i<a.length ;i++) {
			sum += a[i] ;
			
		}
		
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
		
		System.out.println("line 60 ");
		d1.add(1,34,56,78,90,76);
		
		/// compiletime --- Polymorphism 
		
		// var-args  in java 
		
		Employee k  = new Employee() ;
		
		k.salary();
		Employee kk  =  new Developer() ; 
		// k  = new Employee() ;
		
		kk.salary(); // this is example of Runtime polymorphism 
		//k.salary(); 
		
		
		
	}

}
