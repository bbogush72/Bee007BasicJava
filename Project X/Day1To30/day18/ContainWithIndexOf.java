package day18;

import java.util.Scanner;

public class ContainWithIndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a sentence:");
		String sentence = scan.nextLine();
		while (sentence.indexOf("java") == -1) {
			System.out.println("Enter a sentence:");
			sentence = scan.nextLine();
		}
		System.out.println("great job, your sentence contains: " + sentence);
		
	}

}
