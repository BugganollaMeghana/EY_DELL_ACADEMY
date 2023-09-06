package EY_1423;

public class MinvalueInArray {

	public static void main(String[] args) {
         int intArr[] = {10,20,35,56,83,27,11,9};
         min(intArr);
	}
	
	static void min(int[] intArr) {
		int min= intArr[0];
	    for(int i=0; i < intArr.length;i++) {
	    	if(min>intArr[i]) {
	    		min=intArr[i];
	    	}
	    }
		
		System.out.println("Minimum value is " + min);
	}

}
