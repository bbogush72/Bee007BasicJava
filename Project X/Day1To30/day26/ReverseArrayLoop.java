package day26;

import java.util.Arrays;

public class ReverseArrayLoop {

	public static void main(String[] args) {
		int[] numbers = { 1, 9, 2, 8, 3, 6, 5 };
		
		int count = numbers.length;
		
		int lastIndex = count-1;
		
		for(int i=0; i<count/2; i++) {
			
			int temp = numbers[i];
			
			numbers[i]= numbers[lastIndex-i];
			numbers[lastIndex-i]=temp;
				
		}
	System.out.println(Arrays.toString(numbers));
	}

}
