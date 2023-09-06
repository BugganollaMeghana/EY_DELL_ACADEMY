package EY_2108;

import java.util.Enumeration;
import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		
		Vector<String> vec = new Vector<>(10,5);
		
		vec.addElement("A");vec.addElement("A");vec.addElement("A");vec.addElement("A");
		vec.addElement("X");vec.addElement("Y");vec.addElement("Z");
		vec.addElement("M");vec.addElement("M");vec.addElement("N");
		vec.addElement("A");
		
		System.out.println("Size of vector is " + vec.size());
		System.out.println("Capacity of vector is " + vec.capacity());
		
		Enumeration<String> en = vec.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement() + " ");
		}
	}
}
