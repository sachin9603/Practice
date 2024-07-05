package chupeHuye;

public class Student implements Comparable<Student>{

	
	int id ;
	String name  ;
	
	public Student(int id  ,String name ) {
		this.id = id  ;
		this.name =  name ;
		
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.id - o.id;
	}
}
