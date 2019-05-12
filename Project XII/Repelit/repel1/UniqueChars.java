package repel1;


import java.util.*;

public class UniqueChars {
  public static void main(String[] args) {
    //test your code
    System.out.println( uniqueChars("wooden-spoon") ) ;
  }
  
  public static String uniqueChars(String str) {
    //TODO: write your below
    String unique = "";
    
    for(int i=0; i< str.length(); i++){
        char c = str.charAt(i);
        
        if(!unique.contains(""+c)){
            unique= unique+c;
        }
        
    }
    return unique;
  }
  
}
