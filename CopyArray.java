package EY_1423;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {

		char[] chArr1 = {'w','f','h','i','y','l'};
		char[] chArr2 = new char[3];
		
		
		//Arraycopy(SourceArr,StartIndex of source,DestArr, StartIndex of Dest, No. of letters
	    System.arraycopy(chArr1,1,chArr2,0,3);
	    System.out.println(Arrays.toString(chArr2));
	    System.out.println(new String(chArr2));
	}

}
