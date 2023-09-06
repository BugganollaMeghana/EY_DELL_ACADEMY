package EY_2408;

import java.util.ArrayList;
import java.util.Collections;

public class UseOfStream {

	public static void main(String[] args) {
		
		ArrayList<String> countries = new ArrayList<>();
		countries.add("India");
		countries.add("United States");
		countries.add("China");
		
		Collections.sort(countries); 
		for(String country : countries) {
			country = country.toUpperCase();
			if(!country.startsWith("C")) {
				System.out.println("Countries does not start with C-- are " + country);
			}
		}	
		//another method 
		countries.stream().map(s->s.toUpperCase()).
		filter(s-> !s.startsWith("C")).sorted().
		forEach(s->System.out.println(s));
		//stream will not modify collections 
	}

}
