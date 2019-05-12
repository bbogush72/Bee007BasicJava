package day20;

import java.util.Scanner;

public class WhileIF {

	public static void main(String[] args) {

		// print name char by char with while loop
		// Name  = N a m e

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your name");

		Scanner input = new Scanner(System.in);
		String name = scan.next();
		
		int i = 0;
		
		do {
			System.out.print(name.charAt(i) + " ");
			i++;
		} while (i < name.length());
	}

}
