package EY_2408;

import java.util.Optional;

public class TwoMoreFunctionsOfOptionalClass {

	public static void main(String[] args) {
	
		String[]  str = new String[5];
		
		str[2] = "Optional Class Update are coming soon...";
		
		Optional<String> empty = Optional.empty();
		System.out.println(empty);
		
		Optional<String> value = Optional.empty();
		System.out.println(value);

	}

}
