package day35;

public class MethodOverLoading5 {

	public static void main(String[] args) {

		// create a few static method called addNums
		// first one take two numbers and add each, return int result
		// second one takes three numbers and add all, return as int value
		// third one takes four numbers and add all, do not return, print the result
		// only

		System.out.println("total of a+b: " + addNums(43, 44));

		System.out.println("total of a+b+c: " + addNums(3, 4, 5));

		System.out.println("total of a+b+c+d: " + addNums(10, 20, 30, 40));

	}

	public static int addNums(int a, int b) {
		int total = a + b;

		return total;
	}

	public static int addNums(int a, int b, int c) {
		int total = a + b + c;

		return total;
	}

	public static int addNums(int a, int b, int c, int d) {

		return a + b + c + d;

	}
}
