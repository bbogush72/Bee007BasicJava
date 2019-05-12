package day28;

import java.util.Arrays;
import java.util.Scanner;

public class CreateArrayByUserInput {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a word");
		String [] words= {"coding", "start", "to", " Day", "Perfect", "Sunday"};
		String userInput = in.next();
		
		String newWords []= Arrays.copyOf(words, words.length+1);
		
		System.out.println(Arrays.toString(newWords));
		
		int lastIndex = newWords.length-1;
		newWords[lastIndex]= userInput;
		System.out.println(Arrays.toString(newWords));
	}

}
