package day21;
import java.util.Scanner;

public class Palindrome1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String word = scan.nextLine();
    word = word.toLowerCase().replace(" ", "");
    //WRITE YOUR CODE HERE
    
    String reversed ="";
    int length = word.length();
    
    
    for (int i = length - 1; i >= 0; i--)
		reversed = reversed + word.charAt(i);
    
    if(word.equals(reversed))
      System.out.println("true");
    else
      System.out.println("false");
    
  
}
}