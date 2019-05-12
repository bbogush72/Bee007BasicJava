package day31;

import java.util.Scanner;

public class CalcMethod {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Type two numbers to see calculations below");

		int number1 = in.nextInt();
		int number2 = in.nextInt();

		calculation(number1, number2);
	}

	public static void calculation(int number1, int number2) {

		

		System.out.println("Addition result is: " + (number1 + number2));

		System.out.println("Division result is: " + (number1 / number2));

		System.out.println("Multiplication result is: " + (number1 * number2));

		System.out.println("Subtraction result is: " + (number1 - number2));

		System.out.println("Modular division result is: " + (number1 % number2));

	}
}