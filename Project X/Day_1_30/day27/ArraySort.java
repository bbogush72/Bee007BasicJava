package day27;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {
		//

		Scanner in = new Scanner(System.in);

		int nums = in.nextInt();
		int nums1 = in.nextInt();
		int nums2 = in.nextInt();
		int nums3 = in.nextInt();
		int nums4 = in.nextInt();

		int numbers[] = { nums, nums1, nums2, nums3, nums4 };

		System.out.println("initial input: "+ (Arrays.toString(numbers)  ));
		

		// sort method, sorts in descending order
		Arrays.sort(numbers);
		
		System.out.println("descending order input: "+ Arrays.toString(numbers));
		
	
	}
}