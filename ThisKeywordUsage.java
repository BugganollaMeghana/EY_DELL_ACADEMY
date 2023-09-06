package EY_2408;

public class ThisKeywordUsage {
	
	int data = 30;
	
	void display() {
		int data =10;
		System.out.println("The value of Local Variable is " + data);
		System.out.println("The value of Instance Varible is "+ this.data);
	}
	
	void display(int data) {
		System.out.println("Value of Method Variable is " + data);
		this.data = data;
		System.out.println("Value of instance variable  is " + this.data);
	}

	public static void main(String[] args) {
		ThisKeywordUsage obj = new ThisKeywordUsage();
		obj.display();
		obj.display(40);
		obj.display();
	}
}


