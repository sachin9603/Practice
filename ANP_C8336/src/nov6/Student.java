package nov6;

public class Student implements Comparable<Student> {
	
	int id   ;
	String name  ;
	String course  ;
	
	
	public Student(int id, String name, String course) {
	
		this.id = id;
		this.name = name;
		this.course = course;
	}





	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + "]";
	}





	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(id == o.id)
		return name.compareTo(o.name);
		else if (id > o.id) 
			return -1  ;
		else 
			return 1  ;
	}
	
	
	

}
