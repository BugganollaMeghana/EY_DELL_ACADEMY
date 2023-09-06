package EY_1423;

@FunctionalInterface
interface SampleData {
	void fullName(String firstName, String lastName);
}

public class SomeDataFI implements SampleData {
	
	@Override
	public void fullName(String firstName, String lastName) {
		System.out.println("Name is " + firstName + " " +lastName);
	}
	
   public static void main(String[] args) {
	   SomeDataFI obj = new SomeDataFI();
	   obj.fullName("ABC", "XYZ");
   }

}
