package dec9.TryWithResource;

public class Dog  extends Animal {

	
	
	// if parent is throwing any exception so it not mandatory that child would throw exception  
	// and if it is thowing exception so it must be same or it should be some lower exception in 
	//  list
	
    public void overEating (int hour) throws Exception  {
		if (hour > 2) {
			throw new Exception("I am getting die please save me ");
		}else {
			System.out.println("everyThing is file ");
		}
	}
   
   
   
}
