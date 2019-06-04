package day19;

import java.util.Scanner;

public class PalindromeWhile {

	public static void main(String[] args) {
		
		String word, reversed = "";
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a word to see whether a palindrome");
		word = scan.nextLine();
		
		int count=word.length()-1;
        
        while(count>=0) {
            reversed=reversed+word.charAt(count);
            count-- ;
            
        }
        
        if (reversed.equalsIgnoreCase(word)) {
            System.out.println("It is a PALINDROME");
        } else 
            System.out.println("Not a palindrome!!!");
    }
}
