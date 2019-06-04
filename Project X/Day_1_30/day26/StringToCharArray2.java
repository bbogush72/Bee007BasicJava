package day26;

import java.util.Arrays;

public class StringToCharArray2 {

	public static void main(String[] args) {

		String str = "Spartan";

		char[] myChars = new char[str.length()];

		char[] myCharsArray = str.toCharArray(); // <<<<====toCharArray() method is from a String Class

		System.out.println(Arrays.toString(myCharsArray));

	}

}
