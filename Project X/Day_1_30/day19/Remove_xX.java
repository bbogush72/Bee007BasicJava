package day19;

/*Given a string, if the first or last chars are 'x' or 'X', 
 * return the string without those 'x' or 'X' chars,  otherwise return the string unchanged. 

Example: 
input: xHiX 
output: Hi

Example:
input: apple 
output: apple

*/

import java.util.Scanner;

public class Remove_xX {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();

		int wordLength = word.length();
		int b = wordLength - 1;

		String a = word.substring(1, b);

		// String result = word.contains("x" + "X") ? a : word ;

		if (word.contains("x") || word.contains("X")) {
			System.out.println(a);
		} else {
			System.out.println(word);
		}

	}
}