package repl_91_110;

import java.util.Scanner;

public class DigitString2While {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int sum = 0;

		int length = str.length();
		
		char ch;
		
		for (int i = 0; i < length; i++) {
			
			ch = str.charAt(i);
			if (Character.isDigit(ch)) // or do this (ch >= '0' && ch <= '9')
				sum += (ch - '0');
		}
		System.out.println(sum);
	}

}