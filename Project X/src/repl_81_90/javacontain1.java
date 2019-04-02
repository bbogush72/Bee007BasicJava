package repl_81_90;

import java.util.Scanner;

public class javacontain1 {
  public static void main(String[] args) {
    boolean exists = false;
    Scanner scan = new Scanner(System.in);
    String word = scan.next();
    
    int counter =0;
    int javaCount =0;
    int length =word.length()-1;
    
    if(length<=1) {
    	System.out.println("false");
  System.exit(0);
    }
    
    if (word.substring(counter, counter + 2).equals("java")); {
    	javaCount++;

    }

    
     if (javaCount == 1 & word.indexOf(0,2).contains("j")) {
    	System.out.println("true");}
    	
     else if(javaCount<=0) {
    	 System.out.println("false");
     }else {
    	 System.out.println("false");
     }
    
  }
}
