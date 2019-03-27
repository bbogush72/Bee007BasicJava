package repl_20_60;

import java.util.*;
public class BiggerNumber {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    
    int n1 = s.nextInt();
    int n2 = s.nextInt();
    int n3 = s.nextInt();
    
    //your code here
if(n1>n3 && n1>n2){
	  System.out.println("n1 is bigger");
	}

	if(n2>n1 && n2>n3){
	  System.out.println("n2 is bigger");
	}
	  
	if (n3>n1 && n3>n2){
	  System.out.println("n3 is bigger");
	}

	 
	  }
	}
