package day32;

import java.util.Scanner;

public class isAdultOr {

	public static void main(String[] args) {

		isAdultOrNot(0);

	}

	private static boolean isAdultOrNot(int age) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your age:");
		age = in.nextInt();

		if (age >= 18) {
			System.out.println("Yes eligible to vote! ");
		} else {
			System.out.println(("Not eligible to vote! "));
		}
		return false;
	}

}
