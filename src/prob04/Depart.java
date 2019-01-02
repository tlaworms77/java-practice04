package prob04;

public class Depart extends Employee {
	// field
	private String department;

	// Constructor
	public Depart(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public void getInformation() {
		// TODO Auto-generated method stub
		System.out.println("이름: " + getName() + "\t" + 
							"연봉: " + getSalary() + "\t" + 
							"부서: " + getDepartment()
							);
	}

}
