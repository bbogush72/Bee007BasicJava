package day33;

import java.util.Scanner;

public class FirstCharLastWord {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		

		String sentence = in.nextLine();
		
		String firstChar = sentence.substring(0,1);
		
		String []allWords = sentence.split(" ");
		
		String lastWord=allWords[allWords.length-1];
		
		String targetWord = firstChar + lastWord.substring(1);
		
		System.out.println(targetWord);
	}

}
