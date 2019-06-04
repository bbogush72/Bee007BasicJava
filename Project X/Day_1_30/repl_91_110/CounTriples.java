package repl_91_110;

import java.util.Scanner;

public class CounTriples {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String str = scan.next();
	    int count = 0 ;
	   
	    for(int x =0 ; x< str.length()-2 ; x++){
	    	
	    	char newChar = str.charAt(x);
	    	
	    	if (newChar == str.charAt(x+1) &&  newChar == str.charAt(x+2)) {
	    		count++;
	    	}
	    }
	    System.out.println(count);
	}

}

	
