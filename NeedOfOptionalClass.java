package EY_2408;

public class NeedOfOptionalClass {

	public static void main(String[] args) {
		
		String[] words = {"","","","","","ASDFGHJ"};	
		String word = "";
		if(null != words[5]) {
			word = words[5].toLowerCase();
		} else {
			System.out.println("Value at 5th index is null");
		}
		System.out.println(word);	

	}
}
