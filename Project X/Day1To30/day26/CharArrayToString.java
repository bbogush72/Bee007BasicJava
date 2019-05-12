package day26;

import java.util.Arrays;
import java.util.Scanner;

public class CharArrayToString {

	public static void main(String[] args) {

		// create a string and get user input
		//[b, e, n, j, a, m, i, n] turn to name written together
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter names: ");
		String str = scan.nextLine();
		char[] nameChars = str.toCharArray();
		System.out.println(Arrays.toString(nameChars));
		
		String str2 = "";		
		
		for (int i = 0; i < nameChars.length; i++) {

			char c = nameChars[i];
			str2 = str2 + c;

		}
		
		System.out.println(str2);
	}

}
