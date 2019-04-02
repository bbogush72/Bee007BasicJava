package day20;

import java.util.Scanner;

public class StringCounter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
	    
	    int x = 0;
	    int sumA = 0;
	    
	    while(x<word.length()) {
	    
	    	char a = word.toLowerCase().charAt(x++);
	    	if(a=='a')
	    	sumA++;
	    }
  
  System.out.println(sumA);
	}

}
