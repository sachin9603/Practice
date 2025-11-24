package ST;
public class AutoBoxingDemo {
    public static void main(String[] args) {

// Autoboxing: primitive → Wrapper object
int a = 10;
Integer b = a;  // auto conversion
System.out.println("Autoboxing: " + b);

// Unboxing: Wrapper object → primitive
Integer x = 20;
int y = x;  // auto conversion
System.out.println("Unboxing: " + y);

// Works automatically inside Collections
java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
list.add(50);   // autoboxing
int num = list.get(0); // unboxing

System.out.println("List value: " + num);























    }
}
