package day52;

public class InitializerBlocks {

	{
		// instance block: initialize variables
		// instance block execution depends on the creation of the object
		// static block; initializing instance variables
		// and class variables(static variables)
		// static block executes when class is loaded.
	}
	static 
	{
		System.out.println("Static block");
	}

	public InitializerBlocks() 
	{
		System.out.println("Constructor");
	}

	{
		System.out.println("instance block");

	}

	public static void main(String[] args) 
	{

		InitializerBlocks obj = new InitializerBlocks();
		InitializerBlocks obj1 = new InitializerBlocks();
	}

}
