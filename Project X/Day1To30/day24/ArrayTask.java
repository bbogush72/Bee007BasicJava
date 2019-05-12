package day24;

import java.util.Scanner;

public class ArrayTask {

	public static void main(String[] args) {
		//benjamin
		
	//	Scanner in = new Scanner();
		
		System.out.println("Enter names: ");
		
		
		
		char name [] = new char [8];
		
		char name1 [] = new char [] {'B', 'e', 'n', 'j', 'a', 'm', 'i', 'n'};
		
		char name2 [] = { 'B', 'e', 'n', 'j', 'a', 'm', 'i', 'n'};
		System.out.println(name1);
		
		
	//	char result = in. next(). charAt(0);
		
		int length = name2.length;
		
		int i =0;
		
		while(i<=length-1) {
		System.out.print(name2[i]);	
		i++;
		}
		
		
		System.out.println();
		
		for ( int i1=7; i1>=0; i1--) {
			System.out.print(name2[i1]);
		}

	}

}
