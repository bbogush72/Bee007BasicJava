package day33;

import java.util.Scanner;

public class FirstCharLastWord1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String sentence = in.nextLine();
		String firstChar = sentence.substring(0, 1);
		String[] allWords = sentence.split(" ");

		String lastWord = allWords[allWords.length - 1];

		String targetWord = firstChar + lastWord.substring(1);

		//System.out.println(targetWord);

		System.out.println(getMyString(targetWord));
		
		System.out.println(getMyString(targetWord));
	}

	public static String getMyString(String sentence) {

		return sentence;
	}
	public static String firstLast(String s) {
		return s.charAt(0)+s.substring(s.lastIndexOf(" ")+2,s.length());
	}

}

//Optional : 
//* create a method that take one String parameter as sentence 
//* return first character for 
//* first word and all characters of last word except first char
//* example : Love Java --> Lava 
//*    Hold the door --? Hoor