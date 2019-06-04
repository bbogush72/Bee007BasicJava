package day55;

public class EmployeeHourly extends Employee{

//  int id;
//  String name;
  private int monthlyHourWorked; 
  private int hourlyRate;
  
  public EmployeeHourly(int id, String name, int monthlyHourWorked, int hourlyRate) {
    super(id,name);
    this.monthlyHourWorked = monthlyHourWorked;
    this.hourlyRate = hourlyRate;
  }

  public int getMonthlyHourWorked() {
    return monthlyHourWorked;
  }



  public void setMonthlyHourWorked(int monthlyHourWorked) {
    this.monthlyHourWorked = monthlyHourWorked;
  }



  public int getHourlyRate() {
    return hourlyRate;
  }



  public void setHourlyRate(int hourlyRate) {
    this.hourlyRate = hourlyRate;
  }



  @Override
  public String toString() {
    return "HourlyEmployee [monthlyHourWorked=" 
        + monthlyHourWorked + ", hourlyRate=" 
        + hourlyRate + ", id=" + id
        + ", name=" + name + "]";
  }



  @Override
  public void calculateAnnualSalary() {
  
    int annual = monthlyHourWorked * hourlyRate * 12;
    System.out.println("the salary is : "+ annual);
    
  } 

  
}
