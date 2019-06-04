package Abstraction;

public class EmployeeHourly extends Employer {
	
 int id;
 String name;
 int hoursWorked;
 double hourlyRate;
 
 public  EmployeeHourly()
	{
	
	}
 
 public void calculateAnnualSalary(double hourlyRate) 
 	{
	 this.hourlyRate=hourlyRate;
 	}
 
 
}

	