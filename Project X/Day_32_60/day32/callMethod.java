package day32;

public class callMethod {

	public static void main(String[] args) {
		
		System.out.println(returnLong());
		System.out.println(returnLong());
		
		
		long my2YearSalary = returnLong()*2+10000;
		System.out.println("My 2 year salary total: "+my2YearSalary);
	}
	
	
	
	
private static long returnLong() {
		// TODO Auto-generated method stub
		return 150000;
	}


}
