package Com.Anudip.hibernate6879Student;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
	
	@Id 
	private int bookid  ;
	private String bookname  ;
	private int StudentId ;
	
	
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public Book(int bookid, String bookname) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
	}
	public Book() {
		super();
	}
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + "]";
	}
	
	

}
