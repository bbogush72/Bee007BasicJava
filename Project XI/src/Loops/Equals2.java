package Loops;

import java.util.Scanner;

public class Equals2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		sentence = sentence.replace(" ", "");

		int x = 0;
		int count = sentence.length();
		int sumOfJava = 0;
		int sumOfPython = 0;
		String result = "";

		while (count - 6 >= x) {

			if (sentence.substring(x, x + 4).contains("java")) {
				sumOfJava++;
			} else if (sentence.substring(x, x + 6).contains("python")) {
				sumOfPython++;
			}
			x++;
		}
		if (sumOfJava == sumOfPython) {
			result = "true";
		} else if (sumOfJava != sumOfPython) {
			result = "false";
		}
		System.out.println(result);
	}
}