package ArrayMethods;

import java.util.*;

public class printArrayElements {

	public static void main(String[] args) {
		
		int myArray [] = { 2, 4, 6, 8 ,10 };
		
		System.out.println("Print all values of the integer array given using classic for loop");
		for (int i = 0; i < myArray.length; i++) 
		{
			System.out.print(myArray[i]+ " ");
		}
			System.out.println("\n");
		
		
		String [] fruits = { "Apple", "Banana", "Kiwi", "Grapes" };
		System.out.println("Print all values of the String given using for each");
		for(String each: fruits)
		{
			System.out.print(each + " ");
		}
	}

}
