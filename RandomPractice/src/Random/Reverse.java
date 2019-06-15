package Random;

import java.util.Arrays;
import java.util.Collections;

public class Reverse {
	/*
	 * Write the definition of a method reverse, whose parameter is an array of
	 * Strings. The method reverses the elements of the array. The method returns an
	 * array of strings in the reversed order. 
	 * Example: input: ["apple", "pear"]
	 * output: ["pear", "apple"]
	 */
	public static void main(String[] args) {
	
		
	}

	/**
	 * Reverses the order of the elements in the specified array
	 * 
	 * @param arr
	 * @return array of strings
	 */
	public static String[] reverse(String[] arr) {
		Collections.reverse(Arrays.asList(arr)); 
        System.out.println(Arrays.asList(arr)); 
		
		
		return arr;
	}
}