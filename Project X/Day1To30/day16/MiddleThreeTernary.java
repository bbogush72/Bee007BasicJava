package day16;

import java.util.Scanner;

public class MiddleThreeTernary {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your words: ");
		String word = scan.next();
		
		int wordLength = word.length();
		
		String result = wordLength>=5 && wordLength%2 != 0 ? word.substring(wordLength/2 -1, wordLength/2 +2) :"invalid";
		
		System.out.println(result);
		

	}

}
