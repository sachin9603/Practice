package shorts2;
import java.util.*;

public class ForEachExample {
public static void main(String[] args) {
	
	
List<String> messages 
= Arrays.asList("Hi", "Good Morning", "How are you?");

// Normal for loop
for (int i = 0; i < messages.size(); i++) {
System.out.println("Reading: "
+ messages.get(i));
}





System.out.println("---- Using ForEach ----");

// ForEach loop (simple version)
for (String msg : messages) {
    System.out.println("Reading: " + msg);
}




























}
}
