package day29;

import java.util.Scanner;

public class Methods {   //MethodWithParameter
											
  public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);
	  
	  System.out.println("Tell me your name and I tell you what to do: ");
	  String owner = in.nextLine();
	 
	  
	  doYourTask(owner);
	  
    
  }
  
  
  public static void doYourTask(String owner) {
    
  
     
     System.out.println(owner + ", gotta do gotta go gotta rest gotta test");       
    
  }
  

}
