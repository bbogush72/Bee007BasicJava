package day35;


import java.util.Arrays;

public class LongestWordVarArg {
/*
      create static method called findLongestWord
      this method have one parameter as String Vararg
      and return the longest word as String
   
 */
	public static void main(String[] args) {

		longest("Snail", "Pillbug", "Bird", "cat", "fish");
		
		System.out.println(longest("Dragon", "Fly", "Dragonite", "Flyonites"));
	}
	
	public static String longest(String ...longWord) {
		//names will be like String []
		
		
		String longest = longWord[0];
		
		for(int i=0; i<longWord.length; i++) {
			
			if(longWord[i].length()>longWord.length) {
				
				longest = longWord[i];
			}
			 
		}
		return longest;
	
	}

}