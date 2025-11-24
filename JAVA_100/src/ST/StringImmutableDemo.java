package ST;
public class StringImmutableDemo {
public static void main(String[] args) {
String s1 = "Welcome";

// This does NOT change s1
s1.concat(" Home");

System.out.println(s1);  // Output: Welcome

// If we assign it, then new object is returned
String s2 = s1.concat(" Home");
System.out.println(s2);  // Output: Sachin Parmar
    }
}
