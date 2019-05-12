package repl_111_150;

import java.util.Scanner;

public class IntegerFindNonRepeat {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums = { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(),
				input.nextInt(), input.nextInt() };
		/*
		 * Given an array nums with 7 integers every element is repeated twice - except
		 * one. Find that element and print it to console.
		 * 
		 * Example:
		 * 
		 * nums -> [1, 1, 2, 3, 4, 3, 4] 2
		 */
		int count = 0;
		int j;
		int n = nums.length;
		int x = 0;

	//	boolean[] find = new boolean[nums.length];
		
		 int i;
	        for (i = 0; i < nums.length; i++) {
	            try {
	          //      nums[i] = Integer.parseInt(br.readLine());
	            } catch (Exception e) {
	                System.out.println("An error Occurred");
	            }
	        }
	        System.out.println("The elements are ");
	        printElementsWithNoDuplicates(nums[i]);
	    }

	private static void printElementsWithNoDuplicates(int i) {
		// TODO Auto-generated method stub
		
	}
	

	
}