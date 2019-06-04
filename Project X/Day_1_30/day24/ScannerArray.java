package day24;

import java.util.Scanner;

public class ScannerArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] nums = new int[3];

		/*
		 * System.out.println("Enter a number"); nums[0] = scan.nextInt();
		 * 
		 * System.out.println("Enter a number"); nums[1] = scan.nextInt(); //make these
		 * lines shorter down in the for loop
		 * 
		 * System.out.println("Enter a number"); nums[2] = scan.nextInt();
		 */

		for (int i = 0; i < nums.length; i++) {
			System.out.println("Enter number " + (i + 1));

			nums[i] = scan.nextInt();
			System.out.println(nums[i]);

		}

		int min = nums[0];						//===> starting point to check all the values to find smallest number
		for (int i = 0; i < nums.length; i++) {

			if (min > nums[i]) {
				min = nums[i];
				

			}
		}
		System.out.println("Min value is: "+ min);
	}

}
