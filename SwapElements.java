package EY_2808;

public class SwapElements {

	public static void main(String[] args) {
		
		int[] intArr = {20,2,3,-10,100,12,0,-1};
		System.out.println("Elements before swapping");
		for(int i : intArr) {
			System.out.print(i+ " ");
		}
		
		System.out.println();
		//
		int firstIndex = 2, secondIndex = 4;
		
		//
		int temp = intArr[firstIndex];
		
		//
		intArr[firstIndex] = intArr[secondIndex];
		intArr[secondIndex] = temp;
		
		System.out.println("Elements after swapping 4th index value with 2nd index");
		for(int i: intArr) {
			System.out.print(i + " ");
		}
	}
}
