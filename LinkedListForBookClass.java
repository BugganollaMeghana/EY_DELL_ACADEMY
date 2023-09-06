package EY_2108;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListForBookClass {

	public static void main(String[] args) {
			LinkedList<Book> list = new LinkedList<>();
			
			Book b1 = new Book(1,"A","B","C",10);
			Book b2 = new Book(12,"P","Q","R",100);
			Book b3 = new Book(32, "M", "N","O",1000);
			
			list.add(b1);list.add(b1);list.add(b1);
			list.add(b3);list.add(b2);list.add(b2);
			
			Iterator<Book> itr = list.iterator();
			while(itr.hasNext()) {
				Book b = itr.next();
				System.out.println(b.bookId + " " + b.name + " " + b.publisher + 
						" " + b.author + " " +  b.quantity);
			}
	}

}
