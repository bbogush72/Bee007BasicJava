package day16;

import java.util.*;

public class MiddleThree {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		// YOUR CODE HERE

		int wordLength = word.length();

		if (wordLength % 2 == 1 & wordLength == 5) {
			System.out.println(word.substring(1, 4));
		} else if (wordLength % 2 == 1 & wordLength == 7) {
			System.out.println(word.substring(2, 5));
		} else if (wordLength % 2 == 1 & wordLength == 9) {
			System.out.println(word.substring(3, 6));
		} else if (wordLength % 2 == 1 & wordLength == 11) {
			System.out.println(word.substring(4, 7));
		}

		else {
			System.out.println("invalid");
		}

	}
}
