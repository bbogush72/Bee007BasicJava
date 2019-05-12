package Practice;

import java.util.Scanner;

public class ExtractLowerCase {

	public static void main(String[] args) {
		// write a program to extract lowercase letter from a given String — a1b2c3 --> abc
		Scanner in = new Scanner(System.in);
		
	//	System.out.println("Enter a string to reverse");
	//	String str = in.nextLine();
	//	System.out.println("You entered:\n"+ str);
		
		String str = "abcbcfkslgjlrghrlgrger";
		char eachChar ='h';
		
		if(eachChar>='a' && eachChar<='z') {
		System.out.println("it's a lowercase");
		
		
		}
		
		System.out.println("THE END");
		
		String allLowerCase ="";
		for (int i=0; i<str.length(); i++) {
			char each = str.charAt(i);
			if(eachChar>='a' && eachChar<='z') {
				//System.out.println("it's lowercase "+ each);
				
				allLowerCase+=each;
				
			}
			
		}
		System.out.println(allLowerCase);
	}

}
