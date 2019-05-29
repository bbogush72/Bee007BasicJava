package Chapter1;

// write a program that demonstrates how to create and invoke the max method
public class TestMax {
	/** main method */
	public static void main(String[] args) {
		int i = 5;
		int j = 2;
		int k = max(i, j); // invoke max method

		System.out.println("The max between " + i + " and " + j + " is " + k);
	}

	/** return the max between two numbers */
	public static int max(int num1, int num2) {
		int result;
		result = num1 > num2 ? num1 : num2;
		return result;
	}

}
