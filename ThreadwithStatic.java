package EY_2308;

class SharedResources1 {
		synchronized static void print(int n) {     //synchronized key word will synchronize the output
		for(int i=1; i<=5; i++) {                 //static means sharable
			System.out.println(n*i);
			try {
				Thread.sleep(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	}
class MyThreads1 extends Thread {
		SharedResources1 sR;
		
		MyThreads1(SharedResources1 sR) {
			this.sR = sR; 
		}
		
		public void run() {
			sR.print(5);
		}
	}

class MyThreads2 extends Thread {
		SharedResources1 sR;
		
		MyThreads2(SharedResources1 sR) {
			this.sR = sR; 
		}
		
		public void run() {
			sR.print(10);
		}
	}
public class ThreadwithStatic {
	public static void main(String[] args) {
		SharedResources1 obj = new SharedResources1();
		
		MyThreads1 t1 = new MyThreads1(obj);
		MyThreads2 t2 = new MyThreads2(obj);
		
		t1.start();
		t2.start();
		SharedResources1.print(9);
	}
}
