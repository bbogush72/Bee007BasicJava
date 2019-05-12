package Practice;

import java.util.Arrays;

public class SplitMethod {

	public static void main(String[] args) {
		//split method is in String class
		
		
		String groceries = "cucumber, banana , !coconut , avacado, mango , ! watermelon";
		
		groceries.split(" ");
		System.out.println(groceries.length());
		
		String split[] = groceries.split(" ");
		
		System.out.println(Arrays.toString(split));
		
		System.out.println(split.length);
		
		
	}

}
