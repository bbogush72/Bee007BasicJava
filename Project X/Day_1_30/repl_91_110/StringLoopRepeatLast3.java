package repl_91_110;

import java.util.Scanner;

public class StringLoopRepeatLast3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int n = scan.nextInt();

		// String newStr[] = { str };
		int length = str.length();
		int LastChar = str.length() - 1;

		String LastThreeChar = str.substring(LastChar - n+1, LastChar+1);

		for (int i = 0; i <= length; i++) {
			for (int j = 0; j < i; j++) {
				if (n == i) {
					System.out.println(LastThreeChar);
				}
			}

		}
	}
}
