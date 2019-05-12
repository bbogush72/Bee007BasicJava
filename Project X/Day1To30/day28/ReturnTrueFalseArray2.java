package day28;

import java.util.Scanner;

public class ReturnTrueFalseArray2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean value = false;
		int[] array = new int[5];
		System.out.println("enter 5 numbers:");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 10) {
				value = true;

			}

		}
		System.out.println(value);
		input.close();
	}

}
