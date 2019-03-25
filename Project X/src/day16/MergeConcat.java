package day16;

import java.util.*;

public class MergeConcat {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String word1 = scan.next();
    String word2 = scan.next();
    //YOUR CODE HERE
    
    
    int length = word1.length();
    int length1 = word2.length();
    String concat = (length ==3) && (length1 ==3) ? word1.charAt(0)+""+word2.charAt(0)+ 
    												word1.charAt(1)+""+word2.charAt(1)+
    												word1.charAt(2)+""+word2.charAt(2):"cannot merge";
    
    System.out.println(concat);
    
  }
  
}