package ST;
import java.util.ArrayList;

public class WrapperDemo {
    public static void main(String[] args) {

// Primitive
int a = 10;
Integer s = 10 ;
//Primitive → Wrapper Class

//byte    → Byte
//short   → Short
//int     → Integer
//long    → Long
//float   → Float
//double  → Double
//char    → Character
//boolean → Boolean


//Reason 1: Collections
//Collections जैसे ArrayList primitive values नहीं store कर सकती.
//Example:
//ArrayList<int> ❌
//ArrayList<Integer> ✔

//Reason 2: OOP Features
//Objects के साथ methods आते हैं.
//Example: Integer.parseInt(), Double.compare(), आदि.

// Autoboxing: primitive -> object
Integer b = a;

// Unboxing: object -> primitive
int c = b;

System.out.println("Primitive a: " + a);
System.out.println("Autoboxed b: " + b);
System.out.println("Unboxed c: " + c);

// Wrapper class required in collections
ArrayList<Integer> list = new ArrayList<>();
list.add(20);  // autoboxing
list.add(30);

System.out.println("ArrayList: " + list);


























    }
}
