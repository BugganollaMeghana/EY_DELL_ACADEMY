package EY_1708;


class Parent2 {
	void show() {
		System.out.println("Parent Class Function");
	}
	int data = 10;
}

public class RuntimePolymerphism extends Parent2 {
	
	@Override
	void show() {
		System.out.println("Child Class Function");
	}
	int data = 20;
	
	void display() {
		this.show();
		System.out.println("The value of data is " + this.data); // this=child
		super.show();
		System.out.println("The value of data is " + super.data); //super=parent
	}
	
	public static void main(String[] args) {
		
		Parent2 obj1 = new Parent2();
		obj1.show();
		System.out.println("The value of data is " + obj1.data);
		
		
		RuntimePolymerphism obj2 = new RuntimePolymerphism();
		obj2.show();
		System.out.println("The value of data is " + obj2.data);
		
		Parent2 obj3 = new RuntimePolymerphism ();
		obj3.show();
		System.out.println("The value of data is " + obj3.data);
		
		obj2.display();	

	}

}
