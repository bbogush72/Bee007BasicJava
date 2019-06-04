package day53;

public class FinalVariables {//final makes variable constant (immutable)
	final String SEARCH_ENGINE;//instance variable
	public final String JUNE = "June"; //instance variable
	//must initialize MAX_NUMBER_OF_STUDENTS and place it in static block
	final public static  int MAX_NUMBER_OF_STUDENTS; //static variable
	public static String name; //static variable
	
	static
	{
		MAX_NUMBER_OF_STUDENTS=100;
		System.out.println("this is static block");
	
	}
	
	{
		name = "james 007";
		System.out.println("this is init block; instance block");
		SEARCH_ENGINE="google.com";
	}
	
	public static void main(String[] args) 
	{
		System.out.println(FinalVariables.MAX_NUMBER_OF_STUDENTS);
		FinalVariables obj = new FinalVariables();
		//obj.JUNE="July"; this cannot work due to final keyword
		System.out.println("Search engine: "+obj.SEARCH_ENGINE);
		System.out.println(Math.PI);// PI is final (constant)
		
		final String ssn= "999-012-000";
	}
}
