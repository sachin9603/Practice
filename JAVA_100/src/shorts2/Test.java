package shorts2;
class Student {
	
String name;
int age;


Student() {
    this("Unknown");
}
Student(String name) {
    this(name, 18);
}
Student(String name, int age) { }

}

public class Test {
public static void main(String[] args) {
Student s1 = new Student();
Student s2 = new Student("Sachin");
Student s3 = new Student("Rahul", 22);
}






















}
