
package nov_14.collection;

public class Box2{
	
	Integer  p   ;

	public Box2(Integer p) {
		
		this.p = p;
	}
	
	
	


	public void display() {
		// TODO Auto-generated method stub
 System.out.println(p.getClass());
	}
	
	
	
	public static void main(String[] args) {
		
//		Box<Integer> jk = new Box<>(7987)  ;
		Box2 bb = new Box2(1212) ;
		
		
		bb.display();
	}

}
