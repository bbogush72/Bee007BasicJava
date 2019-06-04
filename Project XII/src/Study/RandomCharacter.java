package Study;

import java.util.ArrayList;
import java.util.Collection;

public class RandomCharacter {

	//Generate a random character between char 1 and char 2
	public static char getRandomCharacter(char ch1, char ch2) {
		char x =(char) (ch1 + Math.random()* (ch2-ch1 +1));
		return x;
		
	}
	
	public static char getRandom(int NUMBER_OF_CHARS, int CHARS_PER_LINE) {
		 NUMBER_OF_CHARS= 175;
		 CHARS_PER_LINE = 25;
		 
		for (int i = 0; i < NUMBER_OF_CHARS; i++) {
			char ch = RandomCharacter.getRandomCharacter('z', 'z');
			if( (i+1)%CHARS_PER_LINE == 0) {
				System.out.println();
			}
			
		}
		
		return 0;
	
	}
	
		public static void main(String[] args) {
		
		ArrayList<String>random = new ArrayList<String>(10);
		
		for(int i=0; i<random.size(); i++) {
		
			String a=random.get(RandomCharacter.getRandomCharacter('A', 'Z'));
			char[] arr = a.toCharArray();
			
		}
		
		System.out.println(random.toString());
		
	//	System.out.println(RandomCharacter.getRandomCharacter('A', 'Z'));
}
}