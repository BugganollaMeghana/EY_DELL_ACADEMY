package EY_1423;

public class EqualsMethod {

	public static void main(String[] args) {
			
		String str1 = "String i a immutable class";
		String str2 = "String i a immutable class";
		
		if(str1==str2) {
			System.out.println("works for literates or constants");
		} else {
			System.out.println("doesn't works for literates or constants");
		}

		String str3 = new String("String i a immutable class");
		String str4 = new String("String i a immutable class");
		
		if(str3==str4) {
			System.out.println("works for literates or constants");
		} else {
			System.out.println("doesn't works for literates or constants");
		}
		
		if(str3.equals(str4)) {
			System.out.println("equals method works for OBJECT");
		} else {
			System.out.println("equals method does not works for OBJECT");
		}
		
		System.out.println("Memory Allocation is " + str3.hashCode());
		System.out.println("Memory Allocation is " + str4.hashCode());
		}	
	}


