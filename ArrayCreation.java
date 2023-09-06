package EY_1423;

public class ArrayCreation {
	
	public static void main(String[] args) {
		
	//Declaration - Instantiation	
	int[] intArr = new int[6];
	
	//Intialization
	intArr[0] = 10;
    intArr[1] = 20;
	intArr[2] = 30;
	intArr[3] = 40;
	intArr[4] = 50;
	intArr[5] = 60;
	
	String[] strArr = {"A", "B", "C", "D","E"};
	
	for ( int i =0; i<intArr.length ; i++) {
		System.out.print(intArr[i] + " ");
	}
	
	System.out.println();
	
	for ( int i =0; i<strArr.length ; i++) {
		System.out.print(strArr[i] + " ");
	}
	System.out.println();
	
	for ( int i : intArr) {
		System.out.print(i + " ");
	}
	}
}
