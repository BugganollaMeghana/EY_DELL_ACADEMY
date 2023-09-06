package EY_2408;

public class ImmutableClass {

	public static void main(String[] args) {
		
		String str1 = new String("ABC");
		System.out.println("After First Step - " + str1);
		str1.concat(" -- XYZ");
		System.out.println("After Second Step - " + str1);
		str1 = str1.concat(" -- XYZ");
		System.out.println("After Second Step - " + str1);
		
		StringBuilder str2 = new StringBuilder("ABC");
		System.out.println("After First Step - " + str2);
		//str2.concat(" --XYZ");
		//System.out.println("AFter Second Step - " + str2);
		str2.append(" -- XYZ");
		System.out.println("After Second Step - " + str2);
	}
}
