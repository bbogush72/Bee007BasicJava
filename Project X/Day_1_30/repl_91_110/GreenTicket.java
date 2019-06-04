package repl_91_110;

import java.util.Scanner;

public class GreenTicket {

	public static void main(String[] args) {
		/*
		 * You have a green lottery ticket, with ints a, b, c and d on it. If the
		 * numbers are all different from each other, the prize is 0. If all of the
		 * numbers are the same, the prize is 30. If two of the numbers are the same,
		 * the prize is 10. If three of the numbers are the same, the prize is 20.
		 * 
		 * Example: input: 1 input: 1 input: 1 input: 1 output: 30
		 * 
		 * Example: input: 2 input: 1 input: 1 input: 1 output: 20
		 */

		Scanner scan = new Scanner(System.in);
		int prize = 0;
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();

		int[] abcd = { a, b, c, d };
		int length = abcd.length;
		int count = 0;

		

		for (int i = 0; i < abcd.length; i++) {
			
			for (int j = i + 1; j < length; j++) {

				if (abcd[i] == abcd[j]) {
					count++;
					prize = (j) * 10;
				}

			}

		}
		System.out.println(prize);

	}

}