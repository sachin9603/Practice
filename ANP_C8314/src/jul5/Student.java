package jul5;

import java.util.Objects;

public class Student {
	
	private int id  ; 
	
	private String name  ;
	
	private Address add ;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public Student(int id, String name, Address add) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
	}
	public Student() {} ;
	
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", add=" + add + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(add, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(add, other.add) && id == other.id && Objects.equals(name, other.name);
	}
	
	
	
	
	
	
	
	

}
