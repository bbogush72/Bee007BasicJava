package repl_20_60;

import java.util.*;
public class UserSelection {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("---------------");
    System.out.println("select an option:");
    System.out.println("1) option 1");
    System.out.println("2) option 2");
    System.out.println("3) option 3");
    System.out.println("---------------");
    
    int choice = s.nextInt();
    
    
    //your code here
	if(choice==1){
	  
	  System.out.println("user selected "+choice);
	  
	}
	if (choice ==2){
	 
	  System.out.println("user selected "+ choice);
	  }
	if(choice ==3) {
	  System.out.println("user selected "+choice);}
	}

	    
	  }
