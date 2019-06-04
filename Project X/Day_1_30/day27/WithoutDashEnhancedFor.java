package day27;

import java.util.Scanner;

public class WithoutDashEnhancedFor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("sentence please: ");
		
		String word = scan.nextLine();
		String words[] = word.split(" ");
		
		char[] myChar = null;
		String withDash = "";

		for (String s : words) {
			
			withDash = "";
			
			myChar = s.toCharArray();
			
			for (char c : myChar)
				
				withDash += c + "-";
			
			System.out.println(withDash.substring(0, withDash.length() - 1));
			System.out.println();
		}
	}

}
