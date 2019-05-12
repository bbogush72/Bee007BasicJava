package day29;

import java.util.Arrays;

public class Array2DRev {

	public static void main(String[] args) {
		
		String [] words = { "a1", "a2", "a3", "a4"};
		String [] words1= { "b1", "b2", "b3", "b4"};
		
		String [] wordOfwords [] = new String [2][];
		
		wordOfwords[0] = words;
		wordOfwords[1] = words1;
		
		System.out.print(Arrays.deepToString(wordOfwords));

	}

}
