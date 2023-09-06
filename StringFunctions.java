package EY_2408;

public class StringFunctions {

	public static void main(String[] args) {
		
		//String str1 = "Meghana";
		//String str2 = str1.replace("a","e");
		StringBuilder str1 = new StringBuilder("meghana");
		//str1 = str1.deleteCharAt(0);
		System.out.println(str1);
		//for(int i = 0; i<str1.length();i++) {}
		String str2 = new String("");
		str2 = str1.substring(0,2);
		System.out.println(str2);
		str1.reverse();
		System.out.println(str2);
	}	
}
