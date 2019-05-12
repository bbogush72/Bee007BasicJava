package repl_91_110;

import java.util.Scanner;
/*
 The code provided in your main method will take in five Strings and save them into an array called arr.  
 Print out the first three letter of each element of arr, one per line.  
 You can assume that every element of arr is at least 3 letters long.

Example:
arr -> ["apple", "banana"] 
 prints: app
         ban
 */
public class ArrayPrinting {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] arr = new String[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = input.nextLine();
		}
		// leave above alone! write your code below
		String NewArr ="";
		
		//NewArr= input.indexOf(0,3);
		int lengthArr = arr.length;
		
		for(int i = 0; i<=arr.length; i++) {
			
			arr.toString().getChars(0, 3, null, i);
			if(lengthArr>3) {
			lengthArr= lengthArr-1;}
			
			System.out.println((arr[i]));
		}
		
		System.out.println((arr[0]));
		System.out.println((arr[1]));
		System.out.println((arr[2]));
		System.out.println((arr[3]));
		System.out.println((arr[4]));
		
		

	}
}
