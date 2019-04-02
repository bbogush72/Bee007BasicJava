package day19;

import java.util.Scanner;

public class palindrom {

	public static void main(String[] args) {
		// check whether a word is palindrom
		// ana reverse ana
		// civic reverse civic

		String word, reversed = "";
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a word to see whether a palindrome");
		word = scan.nextLine();

		int length = word.length();

		for (int i = length - 1; i >= 0; i--)
			reversed = reversed + word.charAt(i);

		if (word.equals(reversed))
			System.out.println("The word is a palindrome.");
		else
			System.out.println("The word is not a palindrome.");

	}

}
