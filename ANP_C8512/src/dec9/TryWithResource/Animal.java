package dec9.TryWithResource;

public class Animal {

	public void overEating (int hour) throws ArithmeticException{
		if (hour > 2) {
			throw new ArithmeticException("I am getting die please save me ");
		}else {
			System.out.println("everyThing is file ");
		}
	}
	
}
