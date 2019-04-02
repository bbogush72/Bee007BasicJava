package repl_20_40;

import java.util.*;

public class FindMidNumber {
  public static void main(String[] args) {
    //WRITE YOUR CODE HERE
Scanner scan = new Scanner(System.in);
	    System.out.println("Enter first number:");
	    int num1 = scan.nextInt();
	    
	     System.out.println("Enter second number:");
	    int num2 = scan.nextInt();
	    
	     System.out.println("Enter third number:");
	    int num3 = scan.nextInt();
	    
	    if (num2<num3 && num2>num1){
	     System.out.println("Medium value is: "+num2);
	      
	    }
	     
	    else if (num1<num2 && num1>num3){
	      System.out.println("Medium value is: "+num1);
	      
	    }
	      
	    else if (num3>num1 && num3<num2) { 
	        System.out.println("Medium value is: "+num3);
	      
	    }
	  }
	  
	}
