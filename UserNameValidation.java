package EY_2508;

import java.util.regex.Pattern;

public class UserNameValidation {

	public static void main(String[] args) {
		
		//a-zA-Z0-9 user name can include lower case and upper case alphabets and digits from 0 to 9
        //{6} indicates the length of the user name
        //"abcd34" is the user name
        // it shouldn't contain any special characters
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "abcd34"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "abcd347"));
		
		//Mobile Number Validation
		//[6789]{1} indicates that the number should start with either 6/7/8/9 {1} is length ie only 1 number
        //[0-9]{9} indicates that numbers 0-9 can be used with the length 9
		System.out.println(Pattern.matches("[6789][0-9]{9}", "9898989899"));
		
		
		//trim function is only used to remove leading and trailing white space in string
        //whereas with replace, you can remove white spaces from within
		String str = "      Java Example Trim     Function    ";
		System.out.println("Trimmed is " +str.trim());
		System.out.println("Replaced is " + str.replaceAll("\\s+", ""));
	}
}
