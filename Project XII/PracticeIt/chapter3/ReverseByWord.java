package chapter3;

import java.util.Scanner;

public class ReverseByWord {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String[] arr = str.split(" ");

		int x = arr.length - 1;
		String newS="";
		for (int i = 0; i <= x; i++) {

			System.out.print(arr[x - i] + " ");
		}
		System.out.println();
		for (int i = 0; i <= x; i++) {
			int y = arr[x - i].length() - 1;
			System.out.print(" ");
			for (int j = 0; j <= y; j++) {
				System.out.print(arr[x - i].charAt(y - j));
newS +=arr[x - i].charAt(y - j);
			}
System.out.println(newS.substring(0, newS.length() )+ " ");
		}
	}

}
