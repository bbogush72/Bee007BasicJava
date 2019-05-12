package day28;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {

		int[] nums = { 11, 20, 4, 6, 54, 5, 19, 5 };
		System.out.println("input given this way: " + Arrays.toString(nums));

		Arrays.sort(nums);
		System.out.println("now ordered this way: " + Arrays.toString(nums));

		// Array object must be sorted before using this method

		int index = Arrays.binarySearch(nums, 5);

		System.out.println(index);

		int index20 = Arrays.binarySearch(nums, 20);

		System.out.println(index20);

		System.out.println(Arrays.binarySearch(nums, 54));

		// if we don't have the item in the array, we get minus numbers to
		// point the insertion point of the array to keep array sorted

		int index10 = Arrays.binarySearch(nums, 10);

		System.out.println(index10);
	}

}
