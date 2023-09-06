package EY_2108;

public class Book implements Comparable<Book> { //Custom class or user defined class
	
	int bookId;
	String author, publisher, name;
	int quantity;
	
	Book(int bookId, String author, String publisher, String name, int quantity) {
		this.bookId = bookId;
		this.author = author;
		this.publisher = publisher;
		this.name = name;
		this.quantity = quantity;
	}
	
	public int compareTo(Book o) {
		if(bookId>o.bookId) {
			return 1;
		} else if(bookId<o.bookId) {
			return -1;
		} else {
			return 0;
		}	
	}
	
	public static void main(String[] args) {
		

	}

}
