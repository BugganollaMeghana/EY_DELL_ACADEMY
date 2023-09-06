package EY_1423;

public class PersonData implements Cloneable {
	
	//non static /instance variable
	
	int person_id;
	String person_name;
	
	PersonData(int person_id, String person_name) {
		this.person_id = person_id;
		this.person_name = person_name;
	}
	
	/**/

	public static void main(String[] args) throws CloneNotSupportedException {
		
		PersonData p1 = new PersonData(123, "ABC");
		PersonData p2 = (PersonData) p1.clone();
		
		System.out.println("Person id is " + p1.person_id + " and name is " + p1.person_name);
		System.out.println("Person id is " + p2.person_id + " and name is " + p2.person_name);

	}

}
