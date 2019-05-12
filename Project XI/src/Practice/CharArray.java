package Practice;

import java.util.Arrays;

public class CharArray {

	public static void main(String[] args) {
		
		
		//charArray, charArray count, char to string, string to char, split
		
		//charArray is in String class
		
		String charArray = "Benjamin";
		
		char[] myChar = charArray.toCharArray(); //string returns to char
		
		System.out.println(Arrays.toString(myChar));
		
		System.out.println("elements in myChar: "+myChar.length);
		

		
		String str ="";
		char mychar[] = {'a', 'b', 'c'};
		
		for(int i=0; i<mychar.length; i++) {
			char c= mychar[i];
			str+=c;
			
		}
		System.out.println("char to string result is: "+str);
	}

}
