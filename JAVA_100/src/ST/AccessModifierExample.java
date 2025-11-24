package ST;
class Demo {
public int publicVar = 10;        // accessible everywhere
protected int protectedVar = 20;  // same package + inheritance
int defaultVar = 30;              // only same package
private int privateVar = 40;      // only same class

public void showValues() {
    System.out.println(publicVar);
    System.out.println(protectedVar);
    System.out.println(defaultVar);
    System.out.println(privateVar);
}
}

public class AccessModifierExample {
public static void main(String[] args) {
    Demo d = new Demo();
    System.out.println(d.publicVar);   // OK
    System.out.println(d.protectedVar); // OK (same package)
    System.out.println(d.defaultVar);   // OK (same package)

    // System.out.println(d.privateVar); // ❌ Not allowed
}
}
