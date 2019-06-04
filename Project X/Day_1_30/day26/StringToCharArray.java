package day26;

import java.util.Arrays;

public class StringToCharArray {

	public static void main(String[] args) {


		String str= "Spartan";
		
		char[ ] myChars = new char [str.length()];
		
		for(int i=0; i< myChars.length; i++) {          // or make int size= str.length(); then put the size in place of myChars.length
			
			myChars[i]=str.charAt(i);
			
			
		}
		
		System.out.println(Arrays.toString(myChars));

	}

}
