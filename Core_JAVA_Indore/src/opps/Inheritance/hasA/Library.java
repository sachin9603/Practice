package opps.Inheritance.hasA;

import java.util.Arrays;

public class Library {
	
	private String libraryName ;
	
	private Book[] bookList = new Book[1000] ;
	
	
	
	
	@Override
	public String toString() {
		return "Library [libraryName=" + libraryName + ", bookList=" + Arrays.toString(bookList) + ", index=" + index
				+ "]";
	}

	public Library() {
		super();
	}

	public Library(String libraryName, Book[] bookList, int index) {
		super();
		this.libraryName = libraryName;
		this.bookList = bookList;
		this.index = index;
	}

	public String getLibraryName() {
		return libraryName;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	public Book[] getBookList() {
		return bookList;
	}

	public void setBookList(Book[] bookList) {
		this.bookList = bookList;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	private int index  = 0 ;
	public void addBook(Book obj) {
		
		bookList[index] = obj  ;
		index++  ;
		System.out.println("This Book has been add into library");
		
	}
	
	public void displayBooks() {
		for(Book bb  : bookList) {
			if (bb!=null) {

				System.out.println(bb);
			}
		}
	}
	
	
	

}
