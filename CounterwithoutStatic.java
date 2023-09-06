package EY_1423;

public class CounterwithoutStatic {
	static int count;
	CounterwithoutStatic() {
		count++;
		System.out.println("Value of Count is " + count);
	}

	public static void main(String[] args) {
		
		CounterwithoutStatic c1 = new CounterwithoutStatic();
		CounterwithoutStatic c2 = new CounterwithoutStatic();
		CounterwithoutStatic c3 = new CounterwithoutStatic();
		
		}
		
}
