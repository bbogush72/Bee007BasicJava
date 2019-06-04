package day28;

import java.util.Arrays;

public class ArrayClassMethods {

	public static void main(String[] args) {
		/*
		 * Array Class methods to work with array object
		 * toString(arrObject); ==> return string representation of Array
		 * sort(arrObject); ==> sort the array
		 * copyOf(arrObject, lengthOfNewArr ==> new array with length defined
		 * copyOfRange( arrObject, from, to) ==> works like Substring()
		 * equals(arr1, arr2) ==> true false if all elements are the same and (did not see this part)
		 * 
		 * binarySearch
		 */
			
		String [] words= {"coding", "start", "to", " Day", "Perfect", "Sunday"};
		Arrays.sort(words);
		System.out.println(Arrays.toString(words));
		
		
		String [] first2words= Arrays.copyOf(words, 2);
		System.out.println(Arrays.toString(first2words));
		
		String [] codingStart = Arrays.copyOfRange(words, 3, 4+1);
		System.out.println(Arrays.toString(codingStart));
	}

}
