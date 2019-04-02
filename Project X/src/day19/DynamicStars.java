package day19;

import java.util.Scanner;

public class DynamicStars {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many stairs you want in your new home");
		
		String star = "*";

		int x = scan.nextInt();
		System.out.println(star);
		while (x < 100) {

			star = star + "*";
			x++;

			System.out.println(star);
		}

	}

}