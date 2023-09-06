package EY_2508;


//instead of measuring actual time required in executing each statement
//time complexity consider how many times each statement executes
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World"); //once O(1)
		display();
	}
	
	static void display() {
		int n = 0;
		for(int i =0; i<n; i++) {
			System.out.println("Hello World !!!\n");
		}
		for(int i =0; i<n;i=i*2) {
			System.out.println("Hello World !!!\n");
		}
		for(int i = 0; i<n; i=(int)Math.pow(i, 2)) {
			System.out.println("Hello World !!!\n");
		}
	}

}
