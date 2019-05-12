package day19;

import java.util.Scanner;

public class Count_DoWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number and I count them for you");
		int x = scan.nextInt();

		do {
			System.out.print(x);
			x++;
		} while (x <= 50);
		
		System.out.println("\n");
		do {System.out.print(x);
			x--;
		}while(x>0);
		
		
		
	}

}
