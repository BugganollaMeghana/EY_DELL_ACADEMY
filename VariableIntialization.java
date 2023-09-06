package EY_1423;

public class VariableIntialization {

	
	int number;
	
	VariableIntialization(){ //default constructor
		number=100;
	}
	
	VariableIntialization(int number){ //parameterized constructor
		this.number=number;
		// this keyword resolves the ambiguity between non static instance variable
		//and method parameter
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VariableIntialization obj = new VariableIntialization();
		System.out.println("The value of number is " + obj.number);
		
		VariableIntialization obj2 = new VariableIntialization(1000);
		System.out.println("The value of number is " + obj2.number);
		
	}

}
