package repl_111_150;

import java.util.Scanner;

public class ShortestArray {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String[] str = {in.next(), in.next(), in.next(), 
				in.next(), in.next(), in.next()};
		
		int min= str[0].length();
		int index=0;
		
		for(int i=0; i<str.length; i++) {
			min = str[i].length();
			index=i;
		}
		System.out.println(str[index]);
	}

}
