package repl_91_110;

import java.util.Scanner;

public class DigitString {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str = scan.next();
    int sum  = 0;
   /*
    * Given a string str, print out the sum of the digits 0-9 that appear in the string, ignoring all other characters.
    *  Print out 0 if there are no digits in the string. 
(Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
    * 
    * 
    Example of conversion:
String word = "1java";
boolean isNumber = Character.isDigit(word.charAt(0)); 
<-- in this way, we can check if character is digit.

int num = Integer.parseInt(word.substring(0,1)); 
<-- in this way, we can convert String to int 
    */
   int length = str.length();
  for(int i=0; i<=length; i++) {
	 boolean isNumber =  Character.isDigit(str.charAt(i));
	 
	 if(isNumber==true) {
		 sum= Integer.parseInt(str.substring(i, i+1));
		
		 
	 }
	 
  }
    System.out.println(sum);
    
    
  }
}