package repl_81_90;

import java.util.Scanner;

import java.util.Scanner;

public class CountWords {
  public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
    String word = scan.next();
    
   String numberStr="";
	    int i=0;
		while(word.indexOf("java", word.indexOf("java") + i + 1) != -1) {
		word = word.substring(word.indexOf("java")+1,word.length());
		i++;
	
		}
		System.out.println(i  + 1);
   
  }
}