package Com.Anudip.hibernate6879Student;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import java.util.*;
@Entity
@Table(name = "studentDetails")
@NamedQuery(query = "select e from Student e where e.id = :id", name = "find id")

@NamedNativeQueries({ 
	
	       @NamedNativeQuery(
			name  = "find_all_studnet" ,
			query = "select * from studentdetails",
			resultClass = Student.class
			),
	       @NamedNativeQuery(
	   			name  = "find studnet  by dd" ,
	   			query = "select * from studentdetails where id= :dd ",
	   			resultClass = Student.class
	   			)
	        
	})
public class Student {
	
	@Id
	private int id  ;
	//@Column(name  = "studentKaNaam")
	private String name  ;
	
	@ManyToOne// jab student ka data mai insert karva raha honga tab hi address bhi student table mai fill hojaayega 
	@JoinColumn(name = "aid")
	private Address address  ;
	
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<Book> books ;
	
	
	
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	


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
		this.name = name ;
	}
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}
	 
	
		@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + "]";
	}
	
	

}
