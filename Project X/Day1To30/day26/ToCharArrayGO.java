package day26;

import java.util.Arrays;
import java.util.Scanner;

public class ToCharArrayGO {

	public static void main(String[] args) {

		// create a string and get user input

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter names: ");
		String name = scan.nextLine();
		
		//since we cannot user input as char, we ask a string then turn to char
		
		//for example ==> 
		System.out.println("Enter char to count: ");
		String userChar = scan.next();

		char charToLookFor = userChar.charAt(0);

		char[] myChars = new char[name.length()];

		char[] nameChars = name.toCharArray(); // <<<<====toCharArray() method is from a String Class

		System.out.println(Arrays.toString(nameChars));

		int count = 0;

		for (int i = 0; i < nameChars.length; i++) {

			if (nameChars[i] == charToLookFor) {
				count++;
			}
		}
		System.out.println("the count of "+userChar +": " + count);

	}

}
