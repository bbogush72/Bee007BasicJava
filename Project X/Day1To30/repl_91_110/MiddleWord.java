package repl_91_110;

import java.util.Scanner;

public class MiddleWord {

	public static void main(String[] args) {

		// find the word between 2 "dna" words.
		// dna word can be lower or upper case
		// dnaAAAdna
		// dnaAbcdNa
		Scanner in = new Scanner(System.in);

		String str = in.nextLine();

		String newStr = "";
		int n1 = 0;
		int n2 = 0;
		int count = 0;

		for (int i = 0; i < str.length() - 3; i++) {

			if (str.substring(i, i + 3).equals("dna")) {
				count++;
			}
		}

		if (count >= 3) {
			n1 = str.indexOf("dna");
			n2 = str.indexOf("dna", n1 + 4);
			newStr = str.substring(n1 + 3, n2);

			System.out.println(newStr);
		}
	}
}
