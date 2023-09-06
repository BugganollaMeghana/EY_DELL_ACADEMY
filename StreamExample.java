package EY_2408;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		
		List<String> shoppingList = new ArrayList<>();
		shoppingList.add("coffee");
		shoppingList.add("bread");
		shoppingList.add("pineapple");
		shoppingList.add("milk");
		shoppingList.add("pasta");
		shoppingList.add("apple");
		
		Stream<String> shoppingListStream = shoppingList.stream();
		shoppingListStream.sorted().map(item -> item.toUpperCase()).
			filter(item -> item.startsWith("P")).
			forEach(item ->System.out.println(item));
			
			shoppingListStream.forEach(item-> System.out.println(item));
			

	}

}
