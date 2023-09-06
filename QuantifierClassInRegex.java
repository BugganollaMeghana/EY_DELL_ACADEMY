package EY_2508;

import java.util.regex.Pattern;

// ? - once or not at all
// + occur one or more than once
// * zero or more than once
//[n] times only

public class QuantifierClassInRegex {

	public static void main(String[] args) {
		
		//a or m or n - once or not at all
		System.out.println(Pattern.matches("[amn]?","a"));
		System.out.println(Pattern.matches("[amn]?","z"));
		System.out.println(Pattern.matches("[amn]?","am"));
		System.out.println(Pattern.matches("[amn]?",""));
		
		// a or m or n - one or more than once
		System.out.println(Pattern.matches("[amn]+","aaaa"));
		System.out.println(Pattern.matches("[amn]+","aaaammm"));
		System.out.println(Pattern.matches("[amn]+","aaaammmooo"));
		
		//* a or m or n - zero or more than once 
		System.out.println(Pattern.matches("[amn]*","z"));
		System.out.println(Pattern.matches("[amn]*","aaaammmm"));
		

	}

}
