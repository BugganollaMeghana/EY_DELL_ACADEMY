package EY_2408;


class Parent {
	void show() {
		System.out.println("Parent class Funcation-show");
	}
	int data = 10;
}
public class SuperKeywordExplanation extends Parent {
	
	@Override
	void show() {
		System.out.println("Child class Funcation-show");
	}
	int data = 20;
	
	void display() {
		System.out.println("The value of current class object data is " +this.data);
		System.out.println("The value of immediate parent class object  is " + super.data);
		this.show(); //calling show method of current class
		super.show(); //calling show method of parent class
	}
	
	public static void main(String[] args) {
		
		SuperKeywordExplanation obj = new SuperKeywordExplanation();
		obj.display();
		

	}

}
