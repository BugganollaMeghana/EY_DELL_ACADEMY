package EY_2508;

import java.util.regex.Pattern;

import java.util.regex.Matcher;

public class ALetterWithWord {

		
		private static final String REGEX = "\\bAB\\b";
		private static final String INPUT_STRING = "A A A AB A";
		
		public static void main(String[] args) {
			Pattern p = Pattern.compile(REGEX);
			Matcher m = p.matcher(INPUT_STRING);
			
			int count = 0;
			
			while(m.find()) {
				count++;
				System.out.println("Match Number - "  +count);
				System.out.println("Starting Index - " +m.start());
				//Index or Position or offset after the character matches
				System.out.println("Ending Position - " + m.end());
			}
		}

	}

//trying to find letter "A" in the starting and ending of the input string