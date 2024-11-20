
package nov_14.collection;

public class Box3{
	
	Boolean  p   ;

	public Box3(Boolean p) {
		
		this.p = p;
	}
	
	
	


	public void display() {
		// TODO Auto-generated method stub
 System.out.println(p.getClass());
	}
	
	
	
	public static void main(String[] args) {
		
//		Box<Integer> jk = new Box<>(7987)  ;
		Box3 bb = new Box3(true) ;
		
		
		bb.display();
	}

}
