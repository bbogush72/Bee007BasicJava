package day26;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// {11,2,39,4,15} —-> {15,4,39,2,11}
		
		//reverse this array
		
		int[] numbers = { 11,2,39,7,4,15};
		
		int count = numbers.length;
		
		int temp = numbers[0];
		numbers[0]=numbers[5];
		numbers[5]=temp;
		
		temp = numbers[1];
		numbers[1]=numbers[5-1];
		numbers[5-1]=temp;
		
		temp = numbers[2];
		numbers[2]=numbers[5-2];
		numbers[5-2]=temp;
		
		System.out.println(Arrays.toString(numbers));
	}

}
