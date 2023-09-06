package EY_2308;

public class HowThreadIsCreatedProcess1 extends Thread {

	public static void main(String[] args) {
		
		HowThreadIsCreatedProcess1 t1 = new HowThreadIsCreatedProcess1();
		t1.start();
		

	}
	public void run() {
		System.out.println("Running Automatically");
		
	}

}
