package day21;

import java.util.Scanner;

public class ForLoopName {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String name = input.nextLine();

		for (int i = 0; i < name.length(); i++) {
			
			System.out.println(name.charAt(i));
		}

	}

}
