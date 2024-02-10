package feb9;

public class Student {

	
	int id  ;
	String name  ;
	
	static String collegename = "NRI"  ;
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + " , college =" + collegename + "]";
	}
}
