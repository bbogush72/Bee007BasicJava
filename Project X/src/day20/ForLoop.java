package day20;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		int k = scan.nextInt();
		
		for (int i=k ; i<20; i++) {
			System.out.println(i);
			if(i==10) {
				break;
			}
		}
	}

}
