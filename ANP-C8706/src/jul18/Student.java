package jul18;

import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable<Student> {
	
	int roll  ;
	
	String name   ;
	
	int age  ;

	public Student(int roll, String name, int age) {
		super();
		this.roll = roll;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Student o) {
		
		if(age ==  o.age ) {
			return 0;
		}else if (age > o.age ) {
			return  1  ;
		}else {
			return - 1;
		}
	}
	
	
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		ArrayList<Student> arr  = new ArrayList<>() ;
		
		arr.add(new Student(100091 ,"KK" , 20 )) ;
		arr.add(new Student(1301 ,"44" , 40 )) ;
		
		arr.add(new Student(34301 ,"li" , 60 )) ;
		arr.add(new Student(12321 ,"op" , 10 )) ;
		
		
	Collections.sort(arr);
		
	
		
		for ( Student s :arr) {
			System.out.println(s);
		}
		 
		
		
		
		
	}
	
	
	
	

}
