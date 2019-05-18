package day45;

public class Job {
	
	private String title;
	private String company;
	private double annualSalary;
//	Encapsulate above private instance fields

//	Create 3 arg constructor to set all 3 fields
	public Job(String title, String company, double annualSalary) {
		this.title = title;
		this.company = company;
		this.annualSalary = annualSalary;
	}

//	Create no arg constructor -- constructor with no parameter
//    *       to set title to “undefined”
//    		 to set company to “unknown”
	public Job() {
		this.title = "undefined";
		this.company = "unknown";
	}

//	 Create 1 arg constructor to set title  

	public Job(String title) {
		this.title = title;
	}

//    *   create a method called toString
//    *   it accepts no parameters and
//    *   return concatenation of all field value in nice format
	public String toString() {
		return "Job [Title= " + title + ", Company=" + company + ", Annual Salary=" + annualSalary + "]";
	}

}
