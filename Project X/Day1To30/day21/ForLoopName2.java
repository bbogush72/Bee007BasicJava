package day21;

import java.util.Scanner;

public class ForLoopName2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String yourName = input.nextLine();
		
		for (int i = 0; i < yourName.length(); i++) {
		
		System.out.println(yourName.charAt(i));}
	}

}
