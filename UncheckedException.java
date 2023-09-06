package EY_1708;

public class UncheckedException {

	public static void main(String[] args) {
		//int data = 10/0;
		//System.out.println("Value of data is " + data);
		//Arithmetic Exception
		
		
		UncheckedException obj = new UncheckedException();
		obj = null;
		obj.abc();  //UncheckedException
		
	}
	void abc() {
	System.out.println("Hi");
	}

}
