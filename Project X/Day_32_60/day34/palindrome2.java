package day34;

import java.util.Scanner;

public class palindrome2 {
	public static String reverseString(String a, String b) {

		int count = b.length() - 1;

		while (count >= 0) {
			a = a + b.charAt(count);
			count--;
		}

		return a;
	}

	public static boolean isPalindrome(String sent) {
		String reversed = "";
		sent = sent.replaceAll(" ", "");
		for (int i = sent.length() - 1; i >= 0; i--) {
			reversed = reversed + sent.charAt(i);
		}

		return reversed.equals(sent);

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word to see whether a palindrome");
		String word = scan.nextLine();

		System.out.println(isPalindrome(word));

	}

}
