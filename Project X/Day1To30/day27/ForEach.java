package day27;

import java.util.Scanner;

public class ForEach {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Enter a word");

		String word = in.next();

		char[] myChars = word.toCharArray();

		for (char each : myChars) {
			System.out.print(each + " - ");

			System.out.println();

			System.out.println("Enter a sentence");
			String sentence = in.nextLine();
			char[] myChars1 = sentence.toCharArray();

			for (char each1 : myChars1) {
				System.out.print(each1 + "-");

			}

		}
	}

}