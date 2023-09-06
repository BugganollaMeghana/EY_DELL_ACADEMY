package EY_1423;

public class EmployeeData {
	
	int empId;
	String empName;
	
	static String orgAddress = "ABC XYZ";
	
	static void orgAddressChange() {
		orgAddress="MNO PQR";
	}
	
	EmployeeData(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
		
	}

	void display() {
		System.out.println("Id of emp " + empId + " and Name of emp "  + empName
				+ " andorgaddress is " + orgAddress);
	}
	public static void main(String[] args) {
		
		EmployeeData.orgAddressChange();
		EmployeeData obj1 = new EmployeeData(123, "Elton");
		EmployeeData obj2 = new EmployeeData(456, "John");
		
		obj1.display();
		obj2.display();
		
	}

}
