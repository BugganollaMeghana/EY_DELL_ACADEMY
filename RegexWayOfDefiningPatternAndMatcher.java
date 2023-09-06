package EY_2508;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexWayOfDefiningPatternAndMatcher {

	public static void main(String[] args) {
		
		//compiled representation of regular expression
		Pattern p = Pattern.compile(".o");
		
		Matcher m = p.matcher("Co");
		boolean result = m.matches();
		
		System.out.println("Match Result - " + result);
		
		boolean sameResult2 = Pattern.compile(".s").matcher("a").matches();
		System.out.println("Result is " +sameResult2);
		
		boolean sameResult3 = Pattern.matches(".p","Pq");
		System.out.println("Result is " +sameResult3);
	}

//.o - before one character
//o. - after one Character
//.o. - middle o after and before one character
}


