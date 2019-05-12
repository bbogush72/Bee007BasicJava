package repl_111_150;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseOrderTrial2 {

	public static void main(String[] args) {

		printnewSentence("");
	}

	public static void printnewSentence(String a) {
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();

		// TODO: Type your code below

		String[] newSentence = sentence.split(" ");

		int count = newSentence.length;
		int lastindex = count - 1;

		for (int i = 0; i < count / 2; i++) {
			String temp = newSentence[i];
			newSentence[i] = newSentence[lastindex - i];
			newSentence[lastindex - i] = temp;

		}
		System.out.println(Arrays.toString(newSentence));
		
		

	}

}