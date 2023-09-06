package EY_2108;

import java.util.Hashtable;
import java.util.Map;

public class HashtableClass {

	public static void main(String[] args) {
		
		Hashtable<Integer,String> htable = new Hashtable<>();
		htable.put(123, "ABC");
		htable.put(135, "MNO");
		
		htable.remove(135);
		
		
		for(Map.Entry<Integer,String> m:htable.entrySet()) {
			System.out.println(m.getKey() + " : " + m.getValue()) ;
		}
		
	}

}
