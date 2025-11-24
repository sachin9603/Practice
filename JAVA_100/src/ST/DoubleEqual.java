package ST;

public class DoubleEqual {
public static void main(String[] args) {
		
String s1 = new String("Welcome");
String s2 = new String("Welcome");
System.out.print("s1 == s2--->");
System.out.println(s1 == s2);      // false
System.out.println("s1.equals(s2) -->" +s1.equals(s2)); // true
String s3 = "Welcome";
String s4 = "Welcome";
System.out.print("s3 == s4 --->");
System.out.println(s3 == s4);      // true
System.out.println("s3.equals(s4) -->" +s3.equals(s4)); // true


		
	}

}
