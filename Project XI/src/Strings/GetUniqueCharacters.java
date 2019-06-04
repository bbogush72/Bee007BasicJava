package Strings;

import java.util.Scanner;

public class GetUniqueCharacters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		
		String unique = "";
		for(int i=0; i<word.length(); i++)
		{
			//read the letter and assign
			char letter = word.charAt(i);
			if(!unique.contains(""+letter)) {
				unique += letter; //unique = unique+ch;
			}
			
			if(unique.indexOf(letter) == -1) {
				unique+=letter; // "ab"
			}
			
		}
		System.out.println("unique letter is "+unique);
		
		for(int i=0; i<word.length(); i++)
		{
		//	System.out.println(i);
			System.out.print(word.charAt(i)+" ");
		}
	}

}
