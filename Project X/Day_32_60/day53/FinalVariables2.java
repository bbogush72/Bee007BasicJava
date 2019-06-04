package day53;

final public class FinalVariables2 {
	  private final String SEARCH_ENGINE; // this is not a static variable. It's an instance variable.
	  public final String JUNE = "June";
	  final public static int MAX_NUMBER_OF_STUDENTS;
	  final public static int MAX_NUMBER_OF_TEACHERS = 5;
	  private final String CEO;
	  // The blank final field MAX_NUMBER_OF_STUDENTS may not have been initialized
	  // because it's final, it must be initialized
	  // we need static block to initialize static variables.
	  static {
	    MAX_NUMBER_OF_STUDENTS = 100; // it's ok do initialize final variables here.
	    System.out.println("Hello from static block");
	  }

	  // it's ok when init block initializes non-final variables.
	  {
	    System.out.println("Hello from init block!");
	    SEARCH_ENGINE = "google.com";
	  }
	  
	  public FinalVariables2() {
	    CEO = "Firuz";
	  }
	  

	  public static void main(final String[] args) {
	    // final makes variable constant (immutable)
//	    MAX_NUMBER_OF_STUDENTS = 1;
	    System.out.println(FinalVariables.MAX_NUMBER_OF_STUDENTS);
	    FinalVariables obj = new FinalVariables();
//	    obj.JUNE = "July"; so JUNE variable was defined already. 
//	    Since it's final variable, there is no way to update value.
	    System.out.println(Math.PI); // PI number is final (constant)
	    System.out.println(obj.SEARCH_ENGINE);
	    final String ssn = "999-012-000"; // it's not mandatory
//	    ssn = "888-012-000"; will not compile...
	    

	  }
	}

