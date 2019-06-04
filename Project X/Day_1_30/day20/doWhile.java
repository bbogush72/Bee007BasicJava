package day20;
import java.util.Scanner;
public class doWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 Create a program that ask user a sentence (may or may not contain number) 
		 and store numerical and non-numerical part separately and print out the results. 
		 Also print out the count of the characters from a-z

		 */
		String number = "";
	    String letter = "";
	    String symbol = "";
	    String str = scan.nextLine();
	    for (int i = 0; i < str.length(); i++) 
	    {
	        char a = str.charAt(i);
	        if (Character.isDigit(a)) 
	        {
	            number = number + a;
	            continue;
	        } 
	        if(Character.isLetter(a))
	        {
	            letter = letter + a;
	        }
	        else
	        {
	            symbol = symbol + a;
	        }
	    }
	    System.out.println("Letters in the string: "+letter);
	    System.out.println("Numbers in the String: "+number);   
	}

}
