package repel1;

import java.util.ArrayList;
import java.util.Scanner;

public class _172_RemoveFirstChar {
 public static void main(String[] args) {
    
    String a="";
    removeFirst(a);
    
  }
   public static String removeFirst(String target) {
     Scanner in = new Scanner(System.in);  
     target= in.next();
       
   // String[] sNew = target.split("");
   // char[] myChar = target.toCharArray();
    int lastChar = target.length()-1;
    
    for(int i=0; i<target.length(); i++ ){
        
    }
    
 System.out.println(target.substring(1));
 return target.substring(1);
}
 
}