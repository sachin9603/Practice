package dec22;

public class TestAnimal {
 public static void main(String[] args) {
	// runtime polymorphsim  
	 //  hierarchical inheritance 
	 
	 
	 Animal s  = new Animal() ;
	 
	 Animal a = new Cat() ; 
	 
	 Animal d  = new Dog() ;
	 
	 d.voice(); 
	 s.voice();
	 a.voice();
	 
	 s.speed(50);
	 s.speed(55.50f);
	 //.speed(77.7);
	 
	int aa = s.sum(23, 1 , 5) ;
	int pp = s.sum(1, aa) ;
	
	System.out.println(pp);
	
	System.out.println(aa);
	 
	 
	 
	 
	}
}
