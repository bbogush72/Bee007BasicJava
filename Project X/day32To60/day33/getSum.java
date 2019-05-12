package day33;

public class getSum {
	public static int getsum(int[] arr) {
		int sum = 0;
		for (int a : arr) {
			sum += a;
		}
		return sum;
	}

	public static String addAll(String[] arr) {
		String sentenceArray = "";
		for (String a : arr) {
			sentenceArray += a + " ";
		}
		return sentenceArray;
	}

	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int a : arr) {
			if (a > max)
				max = a;
		}
		return max;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 5, 8, 11 };
		System.out.println("Sum of array items: " + getsum(arr));
		String[] newArr = { "Java " + "is " + "good " + "for " + "us " };

		String sentence = addAll(newArr);
		System.out.println(sentence);

		System.out.println("Max value: " + getMax(arr));
	}

}
