package day25;

import java.util.Arrays;

public class StringArray2 {

	public static void main(String[] args) {
		
		String str [] = new String [4];
		
		str[0] = "Life";
		str[1] = "without";
		str[2] = "love is";
		str[3] = "meaningless";
		
		System.out.println(Arrays.toString(str));	
		for(int i=0; i< str.length; i++) {
		
			System.out.println(str[i].length());
	} 
		//getting the count of array
	//	System.out.println(str.length); // notice this without the parenthesis
		
		// getting the char count of the string
	//	System.out.println(str[3].length());  // notice this with parenthesis
		
		

	}

}
