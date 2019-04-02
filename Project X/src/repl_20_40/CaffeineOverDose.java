package repl_20_40;

import java.util.*;

public class CaffeineOverDose {
  public static void main(String[] args) {
    //WRITE YOUR CODE HERE:
    
   		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter number of milligrams in drink:");
		
		double milliCaffeine = in.nextDouble();
		int count =(int) (10000/milliCaffeine);
		
		
		
		System.out.println("It would take about " + count + " drinks for a lethal overdose.");
    
  }
}
