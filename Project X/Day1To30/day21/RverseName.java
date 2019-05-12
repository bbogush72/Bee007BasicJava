package day21;

import java.util.Scanner;

public class RverseName {

	public static void main(String[] args) {
		String name = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Tell me your name and I will tell you who you are reversed:");
		name = in.nextLine();
		
		
		
		for(int i =name.length()-1; i>=0; i--) {
			System.out.print(name.charAt(i)+ " ");
		}
	}

}
