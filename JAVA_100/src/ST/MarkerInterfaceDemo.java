package ST;
import java.io.Serializable;

class Student implements Serializable {
//A Marker Interface in Java is an interface
//that contains no methods or fields. It is
//used to mark a class so that the Java runtime
//or compiler can identify some special behavior
//or capability of that class.
	
int id;
String name;

public Student(int id, String name) {
    this.id = id;
    this.name = name;
}
}

class Person implements Cloneable {
int age;

public Person(int age) {
    this.age = age;
}

@Override
protected Object clone() throws CloneNotSupportedException {
    return super.clone();  // clone allowed because of Marker Interface
}
}

public class MarkerInterfaceDemo {
    public static void main(String[] args) throws Exception {

// Serializable example (just object creation)
Student s = new Student(1, "Sachin");

// Cloneable example
Person p1 = new Person(25);
Person p2 = (Person) p1.clone();

System.out.println("Original age: " + p1.age);
System.out.println("Cloned age: " + p2.age);
    }
}
