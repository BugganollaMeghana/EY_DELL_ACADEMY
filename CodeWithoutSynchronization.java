package EY_2308;

class SharedResources {
	synchronized void print(int n) {     //synchronized key word will synchronize the output
	for(int i=1; i<=5; i++) {
		System.out.println(n*i);
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
}
class MyThread1 extends Thread {
	SharedResources sR;
	
	MyThread1(SharedResources sR) {
		this.sR = sR; 
	}
	
	public void run() {
		sR.print(5);
	}
}

class MyThread2 extends Thread {
	SharedResources sR;
	
	MyThread2(SharedResources sR) {
		this.sR = sR; 
	}
	
	public void run() {
		sR.print(10);
	}
}
public class CodeWithoutSynchronization {

	public static void main(String[] args) {
		
		SharedResources obj = new SharedResources();
		
		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		
		t1.start();
		t2.start();
	}
}
