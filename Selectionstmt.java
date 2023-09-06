package EY_1423;

public class Selectionstmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks = 85;
		
		if(marks < 100 && marks > 90) {
			System.out.println("Excellent Result " + marks);
		}else if( marks > 80 && marks < 90){
			System.out.println("Very Good Grade");
			
		}else {
			System.out.println("results unknown");
		}
		
		if(marks%2==0) {
			System.out.println("Even");
		}else
			System.out.println("Odd");
			
		

	}

}
