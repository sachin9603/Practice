package sep20;

public class Student {
	
	String name  ;
	Direction d  ;
	
	public static void koiEkHaiStatic() {
		System.out.println("static reference k example k liye mujhe banaya ");
	}
	
	public void koiEkHai() {
		System.out.println("gumnaam hai koi");
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", d=" + d + "]";
	}

	public static void main(String[] args) {
		
		Student s  = new Student()  ;
		s.d = Direction.EAST ;
		s.name  = "Purvi" ;
		
		System.out.println(s);
		
		for ( Direction dd:Direction.values()) {
			System.out.println(dd);
		}
		
		
	}

}
