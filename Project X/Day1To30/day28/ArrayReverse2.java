package day28;

import java.util.Arrays;

public class ArrayReverse2 {

  public static void main(String[] args) {
    
    
    String str = "Sunday Perfect Day to start coding" ; 
    // Reverse above sentence to generate below  
    // coding start to Day Perfect Sunday
    String[] strArr = str.split(" "); 
    
    for (int i = strArr.length-1 ; i >= 0 ; i--) {
    
      //System.out.print(strArr[i] + "-");
    
    }
    
    String strRev = "" ; 
    int lastIndex = strArr.length-1 ; 
    
    for (int i = 0; i < strArr.length/2; i++) {
      //System.out.print(strArr[i] );
      String temp = strArr[i] ;
      strArr[i] = strArr[lastIndex - i] ; 
      strArr[lastIndex - i] = temp ;      
    }
    System.out.println(  Arrays.toString(strArr));
    
    
    // Optional : reverse word + reverse each char of the words
    
    
  }

}