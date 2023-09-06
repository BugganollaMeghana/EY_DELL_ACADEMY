package EY_2308;

public class HowThreadIsCreatedProcess2 implements Runnable{

	public static void main(String[] args) {
		
		HowThreadIsCreatedProcess2 obj = new HowThreadIsCreatedProcess2();
		Thread t1 = new Thread(obj);
		t1.start();

	}
	
	
	public void run() {
		System.out.println(" I also got called automatically");
	}

}


//F5  step in
//F6  One after another running
//F7  To jump after another
//F8  termination