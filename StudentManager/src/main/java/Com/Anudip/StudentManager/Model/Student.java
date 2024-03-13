package Com.Anudip.StudentManager.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;



@Entity
public class Student {
	
	@Id 
	private String StdentId ;
	
	
	@Column(name = "FirstName" , length = 30)
	private String fristname  ;
	
	@Column(name = "LastName" , length = 50)
	private String lastname ;
	
	@Column(length = 50)
	private String gender  ;
	
	@Email(message =  "invalid email plz enter correct formate ")
	@Column(length = 50)
	private String email ;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name= "AID")
	private Adress address;
	
	
	@ManyToOne
	@JoinColumn(name = "sectionId")
    private Sectionn sectionn;
	
	public Sectionn getSectionn() {
		return sectionn;
	}

	public void setSectionn(Sectionn sectionn) {
		this.sectionn = sectionn;
	}

	public Adress getAddress() {
		return address;
	}

	public void setAddress(Adress address) {
		this.address = address;
	}

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="StudentId")
    private List<Book> bookList ;

	

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

	public String getStdentId() {
		return StdentId;
	}

	public void setStdentId(String stdentId) {
		StdentId = stdentId;
	}

	public String getFristname() {
		return fristname;
	}

	public void setFristname(String fristname) {
		this.fristname = fristname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
//
//	public Adress getAddress() {
//		return address;
//	}
//
//	public void setAddress(Adress address) {
//		this.address = address;
//	}

	public Student(String stdentId, String fristname, String lastname, String gender,
			 String email) {
		super();
		StdentId = stdentId;
		this.fristname = fristname;
		this.lastname = lastname;
		this.gender = gender;
		this.email = email;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [StdentId=" + StdentId + ", fristname=" + fristname + ", lastname=" + lastname + ", gender="
				+ gender + ", email=" + email + "]";
	}
	
	
	
	

}
