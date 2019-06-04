package day20;

import java.util.Scanner;

public class ReverseNameForInt {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String sentence = scan.nextLine();
    
    	for(int i = sentence.length(); i>0; i--){
    		
    		System.out.print(sentence.charAt((sentence.length()-1))+"");
            
      
      
    }
    
  }
}

