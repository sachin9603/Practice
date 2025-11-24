package ST;

public class FinallyExample {
	@Override
	protected void finalize() {
	System.out.println("Object destroyed");
	}

final int x = 10;  // cannot be changed
final class A {}  // cannot be inherited
public static void main(String[] args) {

try {
System.out.println(10/0);
} catch (Exception e) {
System.out.println("Error");
} finally {
System.out.println("Always runs");
}

}
@Override
protected void finalize() {
System.out.println("Object destroyed");
}

}
