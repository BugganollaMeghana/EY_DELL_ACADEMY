package EY_1423;

public class Employee {
	
	int empID;
	String empName;
	String empDesignation;
	double empSalary;
	
	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}


	public static void main(String[] args) {

		Employee emp=new Employee();
		emp.setEmpID(014);
		//emp.setEmpName("XYZ");
		//emp.setEmpDesignation("Developer");
		//emp.setEmpSalary(3000.0);
		
		System.out.println("Id of the Employee is "+emp.getEmpID());
		System.out.println("Name of the Employee is "+emp.getEmpName());
		System.out.println("Designation of the Employee is "+emp.getEmpDesignation());
		System.out.println("Salary of the Employee is "+emp.getEmpSalary());
	}

}
