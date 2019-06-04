package repl_111_150;

import java.util.Scanner;

public class LongestArray {

	public static void main(String[] args) {
		//found the shortest instead, set your goal to find the longest then
		
		Scanner in = new Scanner(System.in);
		//String []words = new String[5];
		String[] str = {in.next(), in.next(), in.next(), 
				in.next(), in.next(), in.next()};
		
		int min = str[0].length();
		
		int index=0;
		
		
		for(int i=0; i<str.length; i++) {
			
			if(str[i].length()<min) {
			min=str[i].length();
			index=i;
			
			}
			
		}
		System.out.println(str[index]);
	}
	

}
