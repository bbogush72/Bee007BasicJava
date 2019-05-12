package day26;

import java.util.Arrays;

public class SplitMethod {

	public static void main(String[] args) {

		String str = "Tomatoes, bananas, " + " strawberries, cucumbers ," + "tulips and iceCream" +  " kiwis, mangos";

		String[] words = str.split(",");
		System.out.println(Arrays.toString(words));
		
		String[] groceries = str.split("a");
		System.out.println(Arrays.toString(groceries));
		
		int sizeWords = words.length;
		System.out.println("Size of words input is: "+ sizeWords);
		
		int sizeGroceries = words.length;
		System.out.println("Size of groceries input is: "+ sizeGroceries);
		
		
		int count =0;
		
		for(int i=0; i< words.length; i++) {
			
			System.out.println(words[i].trim().length());
		}
		
	}

}
