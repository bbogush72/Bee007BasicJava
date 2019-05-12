package day31;

import java.util.Scanner;

public class MultipleParameter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = in.next();

		System.out.println("Enter a count");
		int i = in.nextInt();
		repeat("java", i);

		repeat("Snail Mail delivers", i);

		repeat(word, i);
	}

	public static void repeat(String word, int n) {

		for (int i = 1; i <= n; i++) {
			System.out.print(word + " ");
		}

		System.out.println();
	}

}
