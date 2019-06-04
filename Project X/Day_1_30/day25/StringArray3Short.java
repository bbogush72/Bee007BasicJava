package day25;

import java.util.Arrays;

public class StringArray3Short {

	public static void main(String[] args) {
	
		
		String words [] = {"Life", "full of", "wars", "and oppresion", "break", "our heart", "until", "Judgement Day"};
		System.out.println(Arrays.toString(words));	
		for(int i=0; i< words.length; i++) {
			
		}
		System.out.println(words.length);
		
		
		for(int j=0; j<words.length; j++) {
			System.out.println(words[j].length());
		}
		
		
	}

}
