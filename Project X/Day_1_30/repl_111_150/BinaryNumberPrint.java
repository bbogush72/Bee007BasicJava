package repl_111_150;

import java.util.*;

public class BinaryNumberPrint {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int decimal = input.nextInt();
    int[] binary = new int[8];
    
    //TODO: Write your code below.
    
    int i =7;
    while(decimal>0){
    	
    	
      binary[i--]=decimal%2;
      
      decimal = decimal/2;
      //decimal/=2;
    }System.out.println(Arrays.toString(binary));
    
    
  }
}
