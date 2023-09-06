package EY_2408;

public class Thiskeyword {

	public static void main(String[] args) {
		Thiskeyword obj = new Thiskeyword();
		System.out.println(obj);
		obj.display();
		
		Thiskeyword obj2 = new Thiskeyword();
		System.out.println(obj2);
		obj2.display();
	}
	
	void display() {
		System.out.println(this);

	}

}
