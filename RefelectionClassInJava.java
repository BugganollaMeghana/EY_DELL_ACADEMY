package EY_2108;

class SampleClass {}
interface myInterface{}

public class RefelectionClassInJava {

	 void printName(Object obj) {
		Class c = obj.getClass();
		System.out.println(c.getCanonicalName());
		System.out.println(c.getName());
		
	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		SampleClass obj = new SampleClass();
		
		RefelectionClassInJava rC = new RefelectionClassInJava();
		rC.printName(obj);
		
		//examining and modifying the behaviour of the class
		Class c = boolean.class;
		System.out.println(c.getName());
		
		Class c2 = RefelectionClassInJava.class;
		System.out.println(c2.getName());
		
		//forName is used to load the class dynamically
		//returns the instance of the class
		Class c4 = Class.forName("EY_2108.RefelectionClassInJava");
		System.out.println(c4.getName());
	}

}
