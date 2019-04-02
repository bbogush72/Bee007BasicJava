package repl_71_80;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		long n = scan.nextLong();

		long x = 1;
		

		do {
			x = x * n;
			n--;
		} while (n > 1);

		System.out.println(x);

	}
	
	
		
	}
	

