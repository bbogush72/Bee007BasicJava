package day55;

public abstract class Employee {

	  int id;
	  String name;

	  public Employee() {
	    // TODO Auto-generated constructor stub
	  }

	  public Employee(int id, String name) {
	    this.id = id;
	    this.name = name;
	  }

	  public abstract void calculateAnnualSalary();
	//   {
//	     System.out.println("CALCULATE YOURSELF MY CHILD");
	//   }
	  public static void main(String[] args) {
		EmployeeSalary e1= new EmployeeSalary(101, "Snail", 125000);
		e1.calculateAnnualSalary();
		e1.setMonthlySalary();
	    
	  
	  
	  }

	public void setMonthlySalary() {
		
		
	}
	}