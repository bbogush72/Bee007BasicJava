package repl_111_150;

public class backstring {

	public static void main(String[] args) {

		String str = "hello";

		int counter = 0;

		int num1 = -1;

		while (counter != str.length())

		{

			System.out.println(str.charAt(str.length() - num1));

			counter++;

			num1++;

		} // end main

	}
}
