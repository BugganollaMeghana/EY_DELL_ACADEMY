package EY_2808;

import java.util.Arrays;

//Search given key from multiple elements
//faster in performance than linear search
public class BinarySearchAlgorithm {

	public static void main(String[] args) {
		
		int[] intArr = {10,32,2,5,67,8,3};
		Arrays.sort(intArr);   // 2,3,5,8,10,32,67
		int lookOutFor = 32;
		int lastElementPositionInArray = intArr.length - 1;
		binarySearch(intArr, 0, lastElementPositionInArray, lookOutFor);
		
	}
	
	static void binarySearch(int[] intArr, int startingPosition, int lastPosition, int searchElement) {
		int midElementPosition = (startingPosition + lastPosition)/2;
		while(startingPosition<=lastPosition) {
			if(intArr[midElementPosition] < searchElement) {
				startingPosition = midElementPosition +  1;
			} else if(intArr[midElementPosition]==searchElement) {
				System.out.println("Element found at position " + midElementPosition);
				break;
			} else {
				lastPosition = midElementPosition - 1;
			}
			midElementPosition = (startingPosition + lastPosition)/2;
		}
			if(startingPosition > lastPosition) {
				System.out.println("Element is not found");
			}
	}

}
