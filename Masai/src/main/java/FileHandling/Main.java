package FileHandling;


import java.io.*;

class Student implements Serializable{
int id;
String name;
transient int age;//Now it will not be serialized
public Student(int id, String name,int age) {
this.id = id;
this.name = name;
this.age=age;
}
}

public class Main {
	public static void main(String args[])throws Exception{
		Student s1 =new Student(211,"ravi",22);//creating object
		//writing object into file
		FileOutputStream f=new FileOutputStream("f.txt");
		ObjectOutputStream out=new ObjectOutputStream(f);
		out.writeObject(s1);
		out.flush();
		out.close();
		System.out.println("success");
	}
}
