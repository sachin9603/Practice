
package nov_14.collection;

public class Box<T>{
	
	T  p   ;

	public Box(T p) {
		super();
		this.p = p;
	}
	
	
	public Box() {
		
	}


	public void display() {
		// TODO Auto-generated method stub
 System.out.println(p.getClass());
	}
	
	
	
	public static void main(String[] args) {
		
		Box<Integer> jk = new Box<>(7987)  ;
		
		jk.display();
	}

}
