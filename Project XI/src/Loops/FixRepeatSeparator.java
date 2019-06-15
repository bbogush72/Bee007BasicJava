package Loops;
import java.util.Scanner;
/*
 Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.
Example:
input: Word
input: X
input: 3
output: WordXWordXWord

Example:
input: This
input: And
input: 2
output: ThisAndThis

Example:
input: This
input: And
input: 1
output: This
 */
public class FixRepeatSeparator {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String word = scan.next();
    String separator = scan.next();
    int count = scan.nextInt();
    
   int lengthOfWord = word.length();
   
   int totalLength = lengthOfWord * count;
   
   String result = ""+ (word+separator);
   int i=0;
   //n1 = str.indexOf("dna");
  // n2 = str.indexOf("dna", n1 + 4);
   
    while(lengthOfWord <= totalLength && i<=totalLength-lengthOfWord) {
    	
    	i++;
    	result=word+separator;
    	    
    }
System.out.println(result);
  }
}
