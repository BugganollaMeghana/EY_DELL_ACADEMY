package EY_1423;

public class SelectionStmt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		grading('A');
		grading('B');
		grading('C');
		grading('D');

	}
	
	static void grading(char grade) {
		int sucess;
		
		switch(grade) {
		case 'A':
			sucess=1;
			System.out.println("Excellent Grade");
			break;
		case 'B':
		case 'C':
			sucess=0;
			System.out.println("Very Good Grade");
			break;
		default:
			sucess=-1;
			System.out.println("Unknown Grade");
	
		}
		 passTheCourse(sucess);	
	}
	
	static void passTheCourse(int sucess) {
		switch(sucess){
		case 'A':
			sucess=1;
			System.out.println("Passes");
			break;
		case 'B':
		case 'C':
			sucess=0;
			System.out.println("Your Option");
			break;
		default:
			sucess=-1;
			System.out.println("Reschedule");
		
			
		}
	}
	
	
	

}
