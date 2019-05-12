package day26;

import java.util.Arrays;

public class SplitMethod2 {

	public static void main(String[] args) {
		String groceries = "cucumber, banana , coconut , avacado, mango , watermelon";
		String[] veggies = groceries.split(",");
		System.out.println(Arrays.toString(veggies));
		
		veggies = groceries.split(" ");
		
		int count = 0;

		for (int x = 0; x < veggies.length; x++) {
			System.out.println(veggies[x]);
			count++;
		}
		System.out.println(count);
	}

}
