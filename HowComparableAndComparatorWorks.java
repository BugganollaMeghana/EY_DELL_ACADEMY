package EY_2108;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HowComparableAndComparatorWorks {

	public static void main(String[] args) {
		
		int[] intArr = {10,2,82,93,103,1,3,3};
		Arrays.sort(intArr);
		System.out.println("Sorted integer arrays is " + Arrays.toString(intArr));
		
		String[] strArr = {"Z","A","X","B","W"};
		Arrays.sort(strArr);
		System.out.println("Sorted string arrays is " + Arrays.toString(strArr));
		
		List<String> listStr = new ArrayList<>();
		listStr.add("A");listStr.add("B");listStr.add("C");
		listStr.add("D");listStr.add("Z");listStr.add("Z");
		Collections.sort(listStr);
		for(String str: listStr) {
			System.out.print(str + " ");
			
		}

	}

}
