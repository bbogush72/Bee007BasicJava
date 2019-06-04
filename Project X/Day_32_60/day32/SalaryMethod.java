package day32;

public class SalaryMethod {

	public static void main(String[] args) {

		giveMe6DigitSalary();
		giveMe6DigitSalary();
		
		long firstYearSalary = giveMe6DigitSalary();
		long secondYearSalary =(long) ( (firstYearSalary*2  )) ;
		
		System.out.println("1st year salary: "+ firstYearSalary +"\n"+
				"2nd year salary: "+ secondYearSalary);
		
		long secondYearSalary2 =(long) ( (firstYearSalary*2  )*1.1) ;
		System.out.println("Second year salary with the raise: "+secondYearSalary2 );
	}
	
	public static long giveMe6DigitSalary() {
		return 180000L;
	}

}
