package repl_111_150;


import java.util.*;

public class ReverseOrderArray {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String sentence = input.nextLine();
    
    //TODO: Type your code below
    
    String []newSentence=sentence.split(" ");
    
    int count = newSentence.length;
    int lastindex = count-1;
    
    for ( int i =0; i<count/2; i++) {
    	String reversed= newSentence[i];
    	newSentence[i]= newSentence[lastindex -i];
    	newSentence[lastindex -i]=reversed;
    	
    	
    	
    }
    System.out.print(Arrays.toString(newSentence));
  }
}
