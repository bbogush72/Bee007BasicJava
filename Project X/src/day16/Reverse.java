package day16;
import java.util.Scanner;

public class Reverse {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String word = scan.next();
    //WRITE YOUR CODE HERE
    
    int length = word.length();
    
    String reverse = (length==5) ? word.charAt(4)+""+word.charAt(3)+""+word.charAt(2)+""+
    							  word.charAt(1)+""+word.charAt(0)+""+word.charAt(0): 
    							  length >5 ? "Too long!":   length<5 ? "Too short!": "";
    							  
    							  System.out.println(reverse);
    
  }
}
