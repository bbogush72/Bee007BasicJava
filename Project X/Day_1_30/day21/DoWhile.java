package day21;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter two numbers: ");

		int sum = 0;
		int tryCount=0;
		
		do {
			tryCount++;
			if(tryCount==4) {
				System.out.println("You lost!");
				break;
			}
			
			
			int num1 = scan.nextInt();

			int num2 = scan.nextInt();
			sum = num1 + num2;

			System.out.println("Enter two numbers");

			System.out.println(sum);
			
			
			
			
		} while (!((sum) == 100));
		
	}

}
