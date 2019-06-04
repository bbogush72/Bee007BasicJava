package repl_91_110;

import java.util.Scanner;

public class PrintAwordString {

	public static void main(String[] args) {
		/*
		 * Print out the number of times that the string "code" appears anywhere in the
		 * given string. We'll accept any letter for the 'd', so "cope", "core" and
		 * "cooe" count. Example: input: aaacodebbb output: 1
		 * 
		 * Example: input: codexxcode output: 2
		 * 
		 * Example: input: cozexxcore output: 2
		 */
		int count = 0;
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		for(int i=0; i<=str.length()-3; i++) {
			
			if(str.charAt(i)=='c' && str.charAt(i+1)=='o' && str.charAt(i+3)=='e' ) {
				count++;
				
			}
		}
		System.out.println(count);
	}

}
