package EY_2508;

import java.util.regex.Pattern;

public class MetaCharacterInRegex {

	public static void main(String[] args) {
		
		//d - any digit
		//D - any non digit
		//[^0-9] Anything other than 0 to 5
		System.out.println(Pattern.matches("\\d", "abc"));
		System.out.println(Pattern.matches("\\d", "1"));
		
		System.out.println(Pattern.matches("\\d", "1"));
		System.out.println(Pattern.matches("\\d*", "1234"));
		
		System.out.println(Pattern.matches("\\D", "a"));
		System.out.println(Pattern.matches("\\D*", "abc"));
		System.out.println(Pattern.matches("\\D*", "123"));
		//System.out.println(Pattern.matches("\\D*", "123"));
		
		System.out.println("Core Java    Regex".replaceAll("\\s+", " "));

	}

}
