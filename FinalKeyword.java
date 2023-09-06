package EY_1808;

public final class FinalKeyword {
	
	final static String PAN_CARD_NUMBER;
	
	//FinalKeyword() {
	//	PAN_CARD_NUMBER = "TJNBFGHBC789";
	//}
	
	static {
		PAN_CARD_NUMBER = "TJNGTGHBC789";
	}
	final void display() {
		System.out.println("Final Method");
		//PAN_CARD_NUMBER = "TJNGTGHBC789";
	}

	public static void main(String[] args) {
		
		FinalKeyword obj = new FinalKeyword();
		System.out.println("Obj is " +obj.PAN_CARD_NUMBER);
		//The static field FinalKeyword.PAN_CARD_NUMBER should be accessed in a static way

	}

}
