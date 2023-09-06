package EY_2108;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetClass {
	
public static void main(String[] args) {
		
		LinkedHashSet<String> lhSet = new LinkedHashSet<>();
		lhSet.add("Z");lhSet.add("Z");lhSet.add("Z");lhSet.add("Z");
		
		lhSet.add(null);lhSet.add(null);lhSet.add(null);
		
		lhSet.add("X");lhSet.add("Y");lhSet.add("Z");lhSet.add("B");
		
		Iterator<String> itr = lhSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next() + " ");

	}

}
}
