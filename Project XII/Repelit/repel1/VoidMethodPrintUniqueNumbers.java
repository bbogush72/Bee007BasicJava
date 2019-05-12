package repel1;

import java.util.Arrays;
import java.util.Scanner;

public class VoidMethodPrintUniqueNumbers {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number to set the size of the array");
		int size = in.nextInt();
		int []nums = new int [size];
		
		for(int i =0; i<size; i++) {
			nums[i]= in.nextInt();
		}
		
		System.out.println(printUniqueNumbers((nums)));
		
	}
		public static int printUniqueNumbers( int[] nums) {
			int count = 0, index=0;
			for(int i=0; i<nums.length; i++) {
				for(int j=0; j<nums.length; j++) {
					if(nums[i]==nums[j]&& i!=j ) {
						count++;
					}
				}
				if(count==0) {
					System.out.println(nums[i]);
					count=0;
				}
				return nums[i];
			}
			return index;
			
		}

}
