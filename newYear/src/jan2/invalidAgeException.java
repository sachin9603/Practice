package jan2;
///checked --- compile time exception 
public class invalidAgeException  extends Exception{

	public invalidAgeException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public invalidAgeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	
	//checked --- compile  time exception 
	// unchecked ----runtime time exception
}
