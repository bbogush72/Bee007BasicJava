package chapter2;

public class TestPassByValue {
	/** main method 
	 * write a program that demonstrates the effect of passing by value*/
	public static void main(String[] args) {
		//Declare and initialize two variables
		int num1 = 1; int num2 = 2;
		System.out.println("Before invoking the swap method:\n"
				+ "num1 is "+num1+ ", num2 is "+num2);
		
		//invoke the swap method and attempt to swap two variables
		swap(num1, num2);
	}
	/** Swap two variables */
	public static void swap(int n1, int n2)
	{
		System.out.println("\tInside the swap method");
		System.out.println("\t\tBefore swapping n1 is "+n1+ " n2 is "+n2);
		
		/**swap n1 with n2 using temp variable*/
		int temp = n1;     n1=n2;     n2=temp;   
		System.out.println("\t\tAfter swapping  n1 is "+n1+ " n2 is "+n2);
	}

}
