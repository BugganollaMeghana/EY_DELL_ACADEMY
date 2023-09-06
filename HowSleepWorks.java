package EY_2308;

import java.util.concurrent.TimeUnit;

public class HowSleepWorks extends Thread {

	public static void main(String[] args) {
		
		HowSleepWorks t1 = new HowSleepWorks();
		HowSleepWorks t2 = new HowSleepWorks();
		
		t1.start();
		t2.start();
		//t1.run();
		//t2.run();
	}
	
	public void run() {
		for(int i = 1; i<5;i++) {
			try {
				Thread.sleep(1000);
				TimeUnit.SECONDS.sleep(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}

//Breakpoints,Debug as,No switching, Fn+F6
