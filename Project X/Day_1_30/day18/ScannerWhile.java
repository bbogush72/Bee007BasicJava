package day18;

import java.util.Scanner;
public class ScannerWhile {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int x =0;
		//int y= 0;
		
		while(x!=5 && x!=10) {
			
			System.out.println("Give me five or ten dollars!");
			x=scan.nextInt();
			
		}
		
		System.out.println("Good job!");

	}

}
