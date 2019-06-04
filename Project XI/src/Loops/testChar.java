package Loops;

public class testChar {

	public static void main(String[] args) {
		//char letter = word.toLowerCase().charAt(i);
		//use the method above to get chars of the string
		String str= "White box testing";
		
		
		
		
		for (int i = 0; i < str.length(); i++) {
			char letter = str.toLowerCase().charAt(i);
			System.out.print(letter+ " ");
		}

	}

}
