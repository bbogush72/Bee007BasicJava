package day30;

import java.util.Scanner;

public class SayHello {   //MethodWithParameter
											
  public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);
	  
	  System.out.println("type hello Snail Mail will return a magic answer");
	  String hi = in.nextLine();
	 
	  
	  sayhello(hi);
	  
    
  }
  
  
  public static void sayhello(String sayhello) {
    
  
     //sayhello
     System.out.println("saying now hi");       
    
  }
  

}