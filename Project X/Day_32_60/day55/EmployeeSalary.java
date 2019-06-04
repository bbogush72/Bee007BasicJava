package day55;

public class EmployeeSalary extends Employee {

	int monthlySalary;

	public EmployeeSalary(int id, String name, int monthlySalary) {
		super(id, name);
		this.monthlySalary = monthlySalary;
	}

	public  void setEmployeeSalary() {
		
	}

	public void calculateAnnualSalary() {

		int annual = monthlySalary * 12;
		System.out.println("the salary is : " + annual);
		
	}

}
