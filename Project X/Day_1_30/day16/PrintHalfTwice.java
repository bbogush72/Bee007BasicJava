package day16;

import java.util.Scanner;

public class PrintHalfTwice {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String word = scan.next();
    //WRITE YOUR CODE HERE
    
    int length = word.length();
    
    
    String half = word.substring(0, length/2) + word.substring(0, length/2);
    
    System.out.println(half);
    
  }
}
