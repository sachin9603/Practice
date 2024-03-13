package Com.Anudip.StudentManager.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {

	@Id
	private int bookId;

	private String bookname;
	
	private String StudentId ;
	


	public String getStudentId() {
		return StudentId;
	}

	public void setStudentId(String studentId) {
		StudentId = studentId;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	
	public Book() {}

	public Book(int bookId, String bookname, String studentId) {
		super();
		this.bookId = bookId;
		this.bookname = bookname;
		StudentId = studentId;
	} ;
	

}
