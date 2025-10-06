package opps.Inheritance.hasA;

public class Book {
	// private varible 
	// getter setter  
	// toString
	// both contructor
	
	private String title  ;
	private String author  ;
	
	


	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void gyandena() {
		System.out.println("giving knowledge ");
	}
	
	public Book() {
		
		System.out.println("lo mai aagaya, jab aapne object banaya ");
	} ;
	

	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	
	
	
//	Create a Book class with the following attributes:
//
//		String title
//
//		String author
//
//
//
//		2. Create a Library class with the following:
//
//		String name (library name)
//
//		A List<Book> to store multiple books.
//
//
//
//		3. Write methods in Library class to:
//
//		addBook(Book book) → to add a book in the library.
//
//		displayBooks() → to display all book details.
//
//
//
//		4. In the main method:
//
//		Create a Library object.
//
//		Add at least 3 Book objects into the Library.
//
//		Call displayBooks() to print all books.

}
