package EY_2308;

public class DeadLockSituation {

	public static void main(String[] args) {
		final String resource1 = "A";
		final String resource2 = "B";
		Thread t1 = new Thread() {
		public void run() {
			synchronized (resource1) {
				System.out.println("Thread1 : locked resource1");
				try {
					Thread.sleep(1000);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (resource2) {
					System.out.println("Thread1 : Looking for resource2 locked");
				}
			}
		}
	};
	
		Thread t2 = new Thread() {
		public void run() {
			synchronized (resource2) {
				System.out.println("Thread2 : locked resource2");
				try {
					Thread.sleep(1000);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (resource1) {
					System.out.println("Thread2 : Looking for resource1 locked");
				}
			}
		}
	};
	
	t1.start();
	t2.start();
	}
}
