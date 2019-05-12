package Practice;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a string to reverse");
		String str = in.nextLine();
		System.out.println("You entered:\n"+ str);
		
		for(int i= str.length()-1;i>=0; i--) {
		System.out.print(str.substring(i,i+1));
	}
	
	}
}
