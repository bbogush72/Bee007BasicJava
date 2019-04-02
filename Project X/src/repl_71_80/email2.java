package repl_71_80;

import java.util.Scanner;

/*
 Write a program that will print out information about user based on email. 
 Print first and last name from the upper case.

Example:
Input: craig_federighi@apple.com
Output: 
First name: Craig
Last name: Federighi
Domain: apple         
Top-Level Domain: com
 
 */

public class email2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String email = scan.next();
    
    int index = email.indexOf("_");
	int indexAt = email.indexOf("@");
	int indexDot = email.indexOf(".");
	int lastChar = email.length()-1;
	
	
	String str1 = email.substring(0, 1).toUpperCase();
	String first = str1 +email.substring(1, index);
	
	String str2 = email.substring(index+1,index+2).toUpperCase();
	String last = str2+ email.substring(index + 2, indexAt);
	
	String rest = email.substring(indexAt, lastChar);
	String domain = email.substring(indexAt+1, indexDot);
	String topLevel = email.substring(indexDot+1, lastChar+1);
		
	System.out.println("First name: "+first);
	System.out.println("Last name: "+last);
	System.out.println("Domain: "+domain);
	System.out.println("Top-Level Domain: "+topLevel);
    
	/*
	 String s1 = name.substring(0, 1).toUpperCase();
    String nameCapitalized = s1 + name.substring(1);
    System.out.println(nameCapitalized);
	 */
    
  }
}
