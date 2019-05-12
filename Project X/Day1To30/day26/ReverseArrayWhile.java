package day26;

import java.util.Arrays;

public class ReverseArrayWhile {

	public static void main(String[] args) {
		int[] array2 = { 1, 9, 2, 8, 3, 6, 5, 5, 15, 5, 8, -4 };

		int n = array2.length;
		int start = 0;
		int end = n - 1;

		while (start < end) {

			int temp = array2[start];
			array2[start] = array2[end];
			array2[end] = temp;
			start++;
			end--;
		}
		System.out.println(Arrays.toString(array2));

	}

}
