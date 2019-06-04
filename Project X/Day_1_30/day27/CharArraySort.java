package day27;

import java.util.Arrays;

public class CharArraySort {

	public static void main(String[] args) {

		String name = "CyberTek";

		char[] nameChars = name.toCharArray();

		// low to high order ==> special chars mostly, numbers, uppercase, lowercase

		Arrays.sort(nameChars); // sorting of the char characters
		System.out.println(Arrays.toString(nameChars));

		System.out.println(); // just to put a space between

		String groceries[] = { " ? " , " ! " , "potato", "tomato", "pepper", "garlic", "peppers", "Garlics ", "Tomatoes",
				"Potatoes", " - ", " _ ", " & ", " $ ", " # ", " / " , " 1 ", " 10000 ", "100000" };
		
		System.out.println("initial input " + Arrays.toString(groceries));

		System.out.println(); // just to put a space between

		Arrays.sort(groceries); // sorting done here
		System.out.println("descending order output " + Arrays.toString(groceries));

	}

}
