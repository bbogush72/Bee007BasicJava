package repl_81_90;

import java.util.Scanner;

public class CatDog {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int countOfCats = 0;
		int countOfDogs = 0;
		String word = scan.next();

		
	    
		int counter = 0;
		
		if (word.substring(counter, counter + 3).equals("cat")) {
            countOfCats++;

        }

        if (word.substring(counter, counter + 3).equals("dog")) {
            countOfDogs++;

        }
	    
	     if (countOfCats==countOfDogs) {
	    	System.out.println("true");}
	    	
	     else if(countOfCats!=countOfDogs) {
	    	 System.out.println("false");
	     }
	     

	}
}




//catxxdogxxxdog