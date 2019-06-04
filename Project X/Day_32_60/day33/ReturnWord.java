package day33;

import java.util.Scanner;

public class ReturnWord {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		int num =in.nextInt();
		
		if(num<0) {
			System.out.println("Complex words");
			System.out.println("Complex words");
			System.out.println("Complex words");
			System.out.println("Complex words");
			
			//if return is reached, method finishes, out!
			return;
			
		}
		
		
		
	}

}
