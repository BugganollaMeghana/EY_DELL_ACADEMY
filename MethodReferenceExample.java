package EY_2208;

public class MethodReferenceExample {
	
	@FunctionalInterface
	public static interface Converter<F,T> {
		T convert(F from);
	}

	public static void main(String[] args) {
		Converter<String,Integer> intConverter = (from) ->Integer.valueOf(from);
		Integer convertedValue = intConverter.convert("123");                      //By using lamda
		System.out.println("Integer value is " + convertedValue);
		
		//Doing same thing using Method Reference
		Converter<String,Integer> intConverter2 = Integer::valueOf;
		Integer convertedValue2 = intConverter.convert("123");                     //By using method
		System.out.println("Integer value is " + convertedValue2);                  //reference
		
		StartingAlphabet obj = new StartingAlphabet();
		Converter<String,String> strCon = obj::startsWith;
		String value = strCon.convert("Java");
		System.out.println(value);
		
		PersonFactor<Person> PersonObject = Person::new;
		Person Person = PersonObject.create("Core","Java");
		System.out.println("Person name is " +Person.firstName + " " + Person.lastName);
		

	}
	
	static class StartingAlphabet {
		String startsWith(String str) {
			return String.valueOf(str.charAt(0));
		}
	}
	
	interface PersonFactor<P extends Person> {
		P create(String firstName, String lastName);
	}	
}

class Person{
    String firstName;
    String lastName;
    Person(){};

    Person(String firstName,String lastName)
    {
        this.firstName=firstName;
        this.lastName=lastName;
    }
}