package ST;

public class Demo {
public static void main(String[] args) {
String s1 = "Sachin";
String s2 = "Sachin";
//true (same pool object)
System.out.println(s1 == s2); 

String s3 = new String("Sachin");
//false (heap object)
System.out.println(s1 == s3); 

    	
	}
}
