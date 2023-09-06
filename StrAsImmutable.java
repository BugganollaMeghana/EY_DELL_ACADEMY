package EY_1423;

public class StrAsImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = new String("ABC");
		System.out.println(" 1 - Value of str is " + str);
		str.concat("XYZ");
		System.out.println(" 2 - Value of str is " + str);
		str.replace("A", "X");
		System.out.println(" 3 - Value of str is " + str);
		str.concat("PQR");
		System.out.println(" 4 - Value of str is " + str);
		 
		//java 1.1 - Synchronized - thread safe
		StringBuffer str2 = new StringBuffer("ABC");
		System.out.println(" 5 - Value of str is " + str2.toString());
		str2.append("XYZ");
		System.out.println(" 6 - Value of str is " + str2.toString());
		//str2.replace('A', 'X');
		//System.out.println(" 7 - Value of str is " + str2.toString());
		
		
		//java 1.5 - Fast
		StringBuilder str3 = new StringBuilder("MNO");
		System.out.println(" 8 - Value of str is " + str3.toString());
		str3.append("XYZ");
		System.out.println(" 9 - Value of str is " + str3.toString());
		//str3.replace("A", "X");
		//System.out.println(" 7 - Value of str is " + str);
        
	}

}
