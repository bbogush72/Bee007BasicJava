package day44;

import java.util.ArrayList;

public class Job {
	/*Job class
	 *
	 * private fields title , company , annualSalary
	 *
	 * Encapsulate above private instance fields Create no arg constructor --
	 * constructor with no parameter to set title to “undefined” to set company to
	 * “unknown”
	 * 
	 * -- constructor with 1 parameter Create 1 arg constructor to set title --
	 * constructor with 3 parameters Create 3 arg constructor to set all 3 fields
	 *
	 * create a method called toString it accepts no parameters and return
	 * concatenation of all field value in nice format
	 *
	 * Inside another class Called JobSeeking with main method
	 * 
	 * Create few job objects and and add it to ArrayList<Job> object iterate over
	 * all items and print them out
	 */
	private String title;
	private String company;
	private double annualSalary;
	
	public void setTitle(String title, String company, double annualSalary) 
	{
	ArrayList <String> list = new ArrayList<>();
	list.add(title+ " "+ company +" "+ annualSalary);
	
	System.out.println(list.toString());
	}
	
}
//	
//	
//	
//	
//	public String getTitle() 
//	{
//		return title;
//	}
//	
//	public String getCompany() 
//	{
//		return company;
//	}
//	public void setCompany(String sCompany)
//	{
//		company = sCompany;
//	}
//	public double getAnnualSalary()
//	{
//		return annualSalary;
//	}
//	public void setAnnualSalary(double salary)
//	{
//		annualSalary=salary;
//	}
//	
	

