package EY_1608packageA;

public class ClassA {
	
	public int data = 10;    //public,private,protected
	public void display() {   //public,private,protected
		System.out.println("Data is " + data);
	}
	
	public static void main (String[] args) {
		ClassA obj = new ClassA();
		obj.display();
	}

}

