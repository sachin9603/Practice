package opps.Inheritance.hasA;

public class BookEx {
	public static void main(String[] args) {
		
		Book b  = new Book() ;
		b.gyandena();
		
		Book b1 = new Book()  ;
		b1.setAuthor("Shri ram sharma achcarya ");
		b1.setTitle("Parivartan k mahan kshan");
		
		
		
		Book b2 = new Book("Bioelectric of humans " , "Shri ram sharma achcarya ")  ;
		
		
		Book b3 = new Book("Akhand jyoti" , "Shri ram sharma achcarya ")  ;

		
		Library SwamivivekanandLibraby  = new Library ()  ;
		
		SwamivivekanandLibraby.addBook(b1);//0
		SwamivivekanandLibraby.addBook(b3);//1//
		SwamivivekanandLibraby.addBook(b2);//2
		
		SwamivivekanandLibraby.displayBooks();
		
		
		
		
		
		
	SwamivivekanandLibraby.getBookList()[1].setTitle("STri");
	
	SwamivivekanandLibraby.getBookList()[2].setTitle("BOYA OR KATA");
	
	
	SwamivivekanandLibraby.displayBooks();
		
		
		
	}

}
