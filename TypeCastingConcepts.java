package EY_1423;

class Machine{
	void start() {
		System.out.println("Machine has started");
	}
	
	void stop() {
		System.out.println("Machine has stopped");
	}
}

class Camera extends Machine{
	@Override //Good Programming Practice
	void start( ){
		System.out.println("Camera has started");
	}
	void snap() {
		System.out.println("Photo Clicked");
	}
}

public class TypeCastingConcepts {

	public static void main(String[] args) {
	
		
		Machine m = new Machine();
		m.start(); //Machine has started
		m.stop();  //Machine has stopped
		
		Camera c = new Camera();
		c.start();  //Camera has started
		c.stop();   //Machine has stopped
		c.snap();  //Photo Clicked
		
		Machine pc = new Camera();
		pc.start();  //Camera has started
		pc.stop();   //Machine has stopped
		
		//Upcasting
		Machine m2 = c;
		m2.start();
		m2.stop();
		
		
		//Downcasting
		Machine m3 = new Camera();
		Camera c2 = (Camera) m3;
		c2.start();
		c2.stop();
		c2.snap();
		

	}

}
