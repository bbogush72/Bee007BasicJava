package day31;

import java.util.Scanner;

public class GettingChars {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter word");
		
		String word = scan.next();// java
		
		String unique = "";

		for (int i = 0; i < word.length(); i++) {
			
			char letter = word.charAt(i);
			
			if (!unique.contains("" + letter)) {
				
				unique += letter;// add to unique
			}
		}
		
		System.out.println(unique);

	}
}