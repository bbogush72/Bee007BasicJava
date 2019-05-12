package day19;

import java.util.Scanner;

public class LoopingChars {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		
		//how to check whether a string start with a-z!
		
		char firstChar = str.charAt(0);
		
		//System.out.println('a'> 'b');
		
		if (firstChar >= 'a' && firstChar < 'z') {
			
			System.out.println(str +" is lower case letter");
			
		}else {
			System.out.println(str+ " is not a-z");
		}
	}

}
