package day56;

public class salary extends Employee {
//	private int id;
//	private String name;
	 int monthlySalary;
	
	public salary()
	{
		monthlySalary=2000;
	}
	
	@Override
	public void calculateAnnualSalary()
	{
		System.out.println("salary "+monthlySalary*12);
	}

	@Override
	public String toString() {
		return "salary [monthlySalary=" + monthlySalary + "]";
	}
	
	
}
