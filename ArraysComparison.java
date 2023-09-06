package EY_1423;

import java.util.Arrays;

public class ArraysComparison {

	public static void main(String[] args) {
		
		int[] intArr1= {1,2};
		int[] intArr2= {1,2};
		
		boolean[] blnArr1 = {true,false};
		boolean[] blnArr2 = {true,false};

		if(intArr1==intArr2) {
			System.out.println("Works");
		}else{
			System.out.println("Does not Works");
		}
		if(blnArr1==blnArr2) {
			System.out.println("Works");
		}else{
			System.out.println("Does not Works");
		}
		boolean result = Arrays.equals(blnArr1,blnArr2);
		System.out.println("Result is " + result);
		
		System.out.println("Result is " + Arrays.equals(blnArr1, blnArr2));
		System.out.println("Result is " + Arrays.equals(intArr1, intArr2));
		
	}

}
