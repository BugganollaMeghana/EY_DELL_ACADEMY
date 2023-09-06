package EY_2208;

interface Sample {
	String print(String name) ;
}

public class InLineImplementationConcept {

	public static void main(String[] args) {
		
		Sample obj = (name) -> {return "Welcome " + name;};
		System.out.println(obj.print("to lambda expression programming"));		
	}

}
