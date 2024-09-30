package sep30;

// coder is a Student 
public class Coder extends Student {

	
	String laptop ;
	
	public Coder(int id, String name, int marks, String laptop) {
		super(id, name, marks);
		this.laptop = laptop;
	}

	
	






	public Coder() {
		//super(id, name, marks);
	}









	@Override
	public String toString() {
		return "Coder [laptop=" + laptop + "]";
	}









	public void calculation() {
		System.out.println("doing too fast");
	}

}
