package repl_20_60;

import java.util.*;
public class BiggesNumber {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter two numbers");
    int a = s.nextInt();
    int b = s.nextInt();
    //your code here
   
   if(a>b){
     System.out.println(a +" is bigger");
     
   }
    
    if(b>a){
      System.out.println(b +" is bigger");
    }
  }
}
