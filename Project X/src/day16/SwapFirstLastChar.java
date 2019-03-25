package day16;

import java.util.Scanner;

public class SwapFirstLastChar {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String word = scan.nextLine();
    //WRITE YOUR CODE HERE
    
    int wordLength = word.length();
    
    int lastChar = wordLength-1;
   char lastLetter = word.charAt(lastChar);
   
   char firstLetter = word.charAt(0);
   
   
   
   String trimmer = lastLetter + word.substring(1,lastChar)+ firstLetter;
   
   System.out.println(trimmer);
    
  }
}
