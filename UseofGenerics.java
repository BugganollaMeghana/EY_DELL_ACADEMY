package EY_2208;

class MyGeneralizedClass<T> {
	T obj;
	void add(T obj) {
		this.obj = obj;
	}
	T get() {
		return obj;
	}
}
public class UseofGenerics {

	public static void main(String[] args) {
		MyGeneralizedClass<Integer> intType = new MyGeneralizedClass<>();
		intType.add(21);
		System.out.println(intType.get());
		intType.add(31);
		System.out.println(intType.get());
		//intType.add("ABC");
		//compile time error will come if I try to add any other data apart from integer
		
		
		
		MyGeneralizedClass<String> strType = new MyGeneralizedClass<>();
		strType.add("ABC");
		System.out.println(strType.get());
		strType.add("ZXY");
		System.out.println(strType.get());
		//strType.add(31);
		////compile time error will come if I try to add any other data apart from string
		
	
		MyGeneralizedClass<Boolean> boolType = new MyGeneralizedClass<>();
		boolType.add(true);
		
		System.out.println(boolType.get());
	}

}
