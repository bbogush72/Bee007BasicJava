package day33;

public class GetSum2 {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8 };
		String[] str = { "one", "two", "three", "four" };
		System.out.println(getSum(nums));
		System.out.println(getMax(nums));
		System.out.println(addAll(str));

	}

	static int getSum(int[] arr) {
		int sum = 0;
		for (int j = 0; j < arr.length; j++) {
			sum = sum + arr[j];
		}
		return sum;
	}

	static int getMax(int[] arr) {
		int max = 0;
		for (int k = 0; k < arr.length; k++) {
			if (arr[k] > max)
				max = arr[k];
		}
		return max;
	}

	static String addAll(String[] strt) {
		String allStr = "";
		for (int l = 0; l < strt.length; l++) {
			allStr = allStr.concat(strt[l]);
		}
		return allStr;
	}
}
