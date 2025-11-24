
public class StringVsBuilderVsBuffer {
    public static void main(String[] args) {

// String (Immutable)
String s = "Hello";
s.concat(" Java");
System.out.println(s); // Hello (unchanged)

// StringBuilder (Mutable + Fast)
StringBuilder sb = new StringBuilder("Hello");
sb.append(" Java");
System.out.println(sb); // Hello Java

// StringBuffer (Mutable + Thread-safe)
StringBuffer sf = new StringBuffer("Hello");
sf.append(" Java");
System.out.println(sf); // Hello Java
    }
}
