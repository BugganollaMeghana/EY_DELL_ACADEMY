package EY_2108;

import java.util.ArrayList;
import java.util.Iterator;

public class HowArrayListsWork {

	public static void main(String[] args) {
		
		
		//Insertion order is maintained
		//Duplicates are allowed
		ArrayList<String> arrList = new ArrayList<>(); //Generic, only string data
		arrList.add("A");arrList.add("A");arrList.add("A");arrList.add("A");
		
		//any number of null is allowed
		arrList.add(null);arrList.add(null);arrList.add(null);
		
		arrList.add("z");arrList.add("x");arrList.add("y");arrList.add("b");
		
		ArrayList<String> arrList2 = new ArrayList<>();
		arrList2.add("P");arrList2.add("P");arrList2.add("Q");
		
		//Adding second arrayList in first arrayList 
		arrList.addAll(arrList2);
		
		//Size of the arrayList
		System.out.println("Size of my list is" + arrList.size());
		
		//removing first A
		arrList.remove("A");
		
		//Removing second arrayList in first arrayList
		//arrList.removeAll(arrList2);
		
		//Updating the element at the first index in the arraylist
		arrList.set(1, "New Second Element");
		
		//removing all the elements from first arrayList and keeping all elements from second arrayList
		arrList.retainAll(arrList2);
		
		Iterator<String> itr = arrList.iterator();
		while(itr.hasNext()) {
			//hasNext is a boolean type which returns false if there are no iteration to be done
			System.out.println(itr.next() + " ");
		}
		arrList.clear();
		
		//You can also print the arrayList like this also
		for(String str:arrList) {
			System.out.println(str + " ");
		}
	}
}
