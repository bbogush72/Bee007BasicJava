package day27;

import java.util.Scanner;

public class ForEach2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int nums = in.nextInt();int nums1 = in.nextInt();int nums2 = in.nextInt();
		int nums3 = in.nextInt();int nums4 = in.nextInt();

		int numbers[] = { nums, nums1, nums2, nums3, nums4 };
		int sum = 0;
		int min = numbers[1];
		int max = numbers[1];

		for (int each : numbers) {

			sum += each;

			if (min >each) {
				min = each;
			}

			if (max < each) {
				max = each;
			}

		}
		System.out.println("max number: " + max);
		System.out.println("min number: " + min);
		System.out.println("Sum of numbers: " + sum);

	}
}
