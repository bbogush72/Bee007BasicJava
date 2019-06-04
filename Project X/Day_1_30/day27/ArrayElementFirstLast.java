package day27;


import java.util.*;

public class ArrayElementFirstLast {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
   
    String wordsNew = Arrays.toString(words);
    //System.out.println(Arrays.toString(words));
    //TODO: Write your code below
   
    
    char myChar[]= wordsNew.toCharArray();
    
   
    
    char firstLetter = wordsNew.charAt(1);
    char lastLetter = wordsNew.charAt(wordsNew.length() -2);
    
    for(int i=0; i<myChar.length; i++) {
    	for (int j = 1; j < 5; j++) {
    		if (words[i].charAt(1) == words[j].charAt(1)) {
    		
    	}
    	
    	System.out.println(firstLetter);
    }
    }
    
   // System.out.println(charToLookForLast);
    
  }
}
