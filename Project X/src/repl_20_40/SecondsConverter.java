package repl_20_40;

import java.util.*;

public class SecondsConverter {
  public static void main(String[] args) {
    //YOUR CODE HERE:
    System.out.println("Enter seconds:");
	        Scanner in = new Scanner(System.in);
	       
			int seconds = in.nextInt(); 
	        int second = seconds % 60;
	        int hours = seconds / 60;
	        int minutes = hours % 60;
	        hours = hours / 60;
	        System.out.print(hours + " hours, " + minutes + " minutes, " + "and "+second+" seconds");
    
  }
}
