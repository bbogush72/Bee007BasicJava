package repl_111_150;

import java.util.*;

public class FindAllShortsInArray {
	public static void main(String[] args) {
		/*
		 * Write a program that will find out shortest words in the given string str. If
		 * there are few words that are evenly short, print them all. Use split method
		 * in order to split str string variable and create an array of strings. Print
		 * array with Arrays.toString() method. Sort array before printing.
		 */
		// input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
		// out put: cat, old, ray.

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] words = str.split(", ");
		String shortest = words[0];
		for (String s : words) {
			if (shortest.length() > s.length()) {
				shortest = s;
			}
		}
		int counter = 0;
		for (String s : words) {
			if (shortest.length() == s.length()) {
				counter++;
			}
		}
		String[] shortWords = new String[counter];
		for (int i = 0, j = 0; i < words.length; i++) {
			if (shortest.length() == words[i].length()) {
				shortWords[j] = words[i];
				j++;
			}
		}

		Arrays.sort(shortWords);

		// System.out.println(words[index]);
		// print new array
		System.out.println(Arrays.toString(shortWords));
	}
}
