package EY_2108;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListClass {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		
		list.add("A");list.add("A");list.add("A");list.add("A");
		
		//any number of null is allowed
		list.add(null);list.add(null);list.add(null);
		
		list.add("Z");list.add("X");list.add("Y");list.add("B");
		
		list.addFirst("First Element");
		list.addLast("Last Element");
		
		Object firstElement = list.getFirst();
		System.out.println("First Element is " + firstElement);
		
		Object lastElement = list.getLast();
		System.out.println("Last Element is " + lastElement);
		
		int position = list.indexOf("Z");
		System.out.println("Position of Z is " + position);
		
		int lastPositionofA = list.lastIndexOf("A");
		System.out.println("Position of last A is " + lastPositionofA);
		
		list.add(0,"Added element od the zeroth index");
		list.remove(2); //remove element from second index
		
		list.removeFirst();
		list.removeLast();
		
		list.removeFirstOccurrence("A");
		list.removeLastOccurrence("A");
		
		Object o = list.poll(); //returns and remove the first item of the list
		Object o2 = list.pollLast(); //returns and remove the last item of the list
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			//hasNext is a boolean type which returns false if there are no iteration to be done
			System.out.print(itr.next() + " ");
	}
		ListIterator<String> listItr = list.listIterator();
		while(listItr.hasNext()) {
			System.out.print(listItr.next() + " ");
		}
		
		System.out.println();
		while(listItr.hasPrevious()) {
			System.out.print(listItr.previous() + " ");
		}
	}

}
