package day56;

public  class hourly extends Employee  {

//	private int id;
//	private String name;
	 int monthlyHourWorked;
	 int hourlyRate;
	
	 public hourly()
		{
		 monthlyHourWorked=100;
		 hourlyRate = 20;
		}
	 @Override
	public void calculateAnnualSalary()
	{

		System.out.println("hourlyPay: "+monthlyHourWorked* hourlyRate*12);
	}
}
