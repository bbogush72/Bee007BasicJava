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
    
   
    int j = word.indexOf("j");
    
    
    
     if (j<3) {
    	System.out.println("true");}
    	
     else if(j>=3) {
    	 System.out.println("false");
     }else {
    	 System.out.println("false");
     }
    
  }
}
