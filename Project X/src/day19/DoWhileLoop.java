package day19;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many stairs you want in your new home");
		int x = scan.nextInt();

		String star = "*";

		do {
			System.out.println(star);
			star = star + "*";
			x--;

		} while (x > 1);

	}

}
