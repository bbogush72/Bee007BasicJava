package Abstraction;

public class EmployeeSalary extends Employer {

	private int id;
	private String name;
	private double AnnualSalary;
	public int getId() 
	{
		return id;
	}
	public void calculateAnnualSalary(int AnnualSalary) 
	{
		 this.AnnualSalary= AnnualSalary;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public double getAnnualSalary() 
	{
		return AnnualSalary;
	}
	public void setAnnualSalary(double annualSalary) 
	{
		AnnualSalary = annualSalary;
	}
	@Override
	public String toString() 
	{
		return "EmployeeSalary [id=" + id + ", name=" + name + ", AnnualSalary=" + AnnualSalary + "]";
	}
	
}
