package day50;

public class MethodChaining {

	public static void main(String[] args) {
		
		//step 1 call a method
		methodA();
		//step 7 the end of execution
		
	}
	
	public static void methodA()
	{
		//step 2 calling B first
		methodB();
		
		//step 6 calling A last
		System.out.println("methodA() called");
	}
	
	public static void methodB()
	{
		//Step 3 b called from here first
		System.out.println("methodB() called");
		
		//Step 4
		methodC();
	}
	
	public static void methodC()
	{
		//Step 5
		System.out.println("methodC() called");
	}

}
