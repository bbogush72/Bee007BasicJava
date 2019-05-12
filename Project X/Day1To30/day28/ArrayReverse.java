package day28;

import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) {
		
		String str = "Sunday Perfect Day to start coding";
		String strArr[]= str.split(" ");
		System.out.println(Arrays.toString(strArr));
		
		
		char [] wordChars = str.toCharArray();
		int lastIndex = wordChars.length-1;
		
		for(int i=0; i<wordChars.length/2; i++) {
			char temp = wordChars[i];
			wordChars[i]= wordChars[lastIndex-i];
			wordChars[lastIndex-i]= temp;
			
		}
		String reversed = new String(wordChars);
		
		System.out.println(reversed);
		
		

	}

}
