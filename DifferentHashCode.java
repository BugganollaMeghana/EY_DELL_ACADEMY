package EY_2508;

public class DifferentHashCode {

	public static void main(String[] args) {
		
		DifferentHashCode obj = new DifferentHashCode();
		System.out.println(obj.hashCode());
		
		DifferentHashCode obj2 = new DifferentHashCode();
		System.out.println(obj2.hashCode());
		
		DifferentHashCode obj3 = new DifferentHashCode();
		System.out.println(obj3.hashCode());

		DifferentHashCode obj4 = new DifferentHashCode();
		System.out.println(obj4.hashCode());
	}

}
