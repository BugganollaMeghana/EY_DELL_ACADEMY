package EY_2308;

class Reentrant{
	
	public synchronized void m() {
		n();
		System.out.println("I am in M synchronized method");
	}
	public synchronized void n() {
		System.out.println("I am in N synchronized method ");
	}
}

public class ReentrantThreadExample {

	public static void main(String[] args) {
		final Reentrant r = new Reentrant();
		new Thread() {
			public void run() {
				r.m();
			}
		}.start();
	}
}
