package day32;

import java.util.Scanner;

public class VoteMethod {

	public static void main(String[] args) {

		String b = isAdultOrNot();
		System.out.println("Is the person adult?: " + b);
	}

	public static String isAdultOrNot() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age = in.nextInt();
		
		String CheckAge = age > 18 ? "Yes" : "No";

		return CheckAge;
	}
}