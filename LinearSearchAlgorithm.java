package EY_2808;

import java.util.Arrays;

public class LinearSearchAlgorithm {

	public static void main(String[] args) {
		
		int[]  intArr = {10,7,3,8,20};
		int lengthOfArray = intArr.length;
		
		int searchElement = 8;
		
		int index = searchProgram(intArr, lengthOfArray, searchElement);
		if(index == -1) {
			System.out.println("Element " + searchElement + " is not " + " present in array " + Arrays.toString(intArr));
		} else {
			System.out.println("Element " + searchElement + " found " + " at index " + index);
		}
	}
	
	static int searchProgram(int[] intArr, int length, int element) {
		for(int i = 0; i<length; i++) {
			if(intArr[i]==element) {
				return i;
			}
		}
		return -1;  // last index which means element not found
	}
}
