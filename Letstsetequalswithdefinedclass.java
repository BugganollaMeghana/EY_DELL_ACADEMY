package EY_1423;

import java.util.Objects;

class Employe {
	
	String firstName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employe other = (Employe) obj;
		return Objects.equals(firstName, other.firstName);
	}
		
}

public class Letstsetequalswithdefinedclass {

	public static void main(String[] args) {
		
		Employe e1 = new Employe();
		Employe e2 = new Employe();
		
		e1.setFirstName("ABC");
		e2.setFirstName("ABC");
		
		if(e1.equals(e2)) {
			System.out.println("equals works with Custom Class");
		} else {
			System.out.println("equals does not works with Custom Class");
		}
		
		System.out.println("Memory Allocation is " + e1.hashCode());
		System.out.println("Memory Allocation is " + e2.hashCode());

	}

}
