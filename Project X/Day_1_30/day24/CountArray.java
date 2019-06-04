package day24;

import java.util.Arrays;

public class CountArray {

	public static void main(String[] args) {

		// TASK :

		// int[] nums = {1,55,7,898,9,55} ;
		// print
		// find the count of numbers more than 100 ;

		int[] nums = { 1, 55, 7, 898, 9, 55 };
		// find the count of numbers that are more than 100;
		
		int biggerThan100 = 100;
		
		for (int i = 0; i < nums.length; i++) {
			
			if (nums[i] > biggerThan100) {
				
				System.out.print(nums[i]);
			}
		}
	}
}