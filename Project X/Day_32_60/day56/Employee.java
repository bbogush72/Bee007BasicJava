package day56;

public abstract class Employee {
	
	private int id;
	private String name;

	
	public abstract void calculateAnnualSalary();

	public static void main(String[] args) 
	{
		hourly h1 = new hourly();
		
		salary s1 = new salary();
		
		s1.calculateAnnualSalary();
		h1.calculateAnnualSalary();
		
		System.out.println(s1.toString());
	}	
	
}


/*why we use abstraction?
	code reusability
	
	*
	*
	*
	*/