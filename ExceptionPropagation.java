package EY_1708;

public class ExceptionPropagation {

	public static void main(String[] args) {
		System.out.println("Method main");
		try {
			ExceptionPropagation obj = new ExceptionPropagation();
			obj.a();
		} catch(InterruptedException e) {
			System.out.println("Main Method" + e.getMessage());
		}
	}
	void a() throws InterruptedException {
		System.out.println("Method A");
		b();
	}
	void b() throws InterruptedException {
		System.out.println("Method B");
		c();
	}
	void c() throws InterruptedException {
		System.out.println("Method C");
	}
}
