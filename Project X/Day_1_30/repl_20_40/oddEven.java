package repl_20_40;


import java.util.*;

public class oddEven {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number:");
    int number = input.nextInt();
   
    //CODE HERE 
	    if(number%2==0) {
		    	System.out.println(number+ " is even");
		    }
		    
		    else if(number%2!=0) {
		    	System.out.println(number +" is odd");
		    }
		    
		    else if(number ==0) {
		    	System.out.println(number);
		    	System.out.println("0 is even ");
		    }

	}

}
