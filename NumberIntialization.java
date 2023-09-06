package EY_1423;

public class NumberIntialization {
	
	int number1;
	static int number2;
	
	static {
		System.out.println("Static is Intialized");
		number2 =100;
	}
    
	NumberIntialization() {
		number1 = 78;
	}
	
	public static void main(String[] args) {
		System.out.println("Main Method");
		
		System.out.println("The value of number2 is " + number2);
		
		NumberIntialization obj = new NumberIntialization();
		System.out.println("The value of number1 is " + obj.number1);
		
	}

}

// without static value will be 1,1, 1