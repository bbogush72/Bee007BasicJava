package repl_111_150;

import java.util.*;

public class StringArrayPrintFirstLastChars {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String[] words = { input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine() };
		
		
		
		int count = words.length - 1;

		for (int i = 0; i <= count; i++) {
					
			words[i]=words[i].substring(0,1) +words[i].substring(words[i].length()-1,words[i].length());
			
			
		}
		
		System.out.print(Arrays.toString(words));
	}
}