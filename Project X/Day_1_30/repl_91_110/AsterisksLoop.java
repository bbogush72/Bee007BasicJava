package repl_91_110;

import java.util.Scanner;

public class AsterisksLoop {
  public static void main(String[] args) {
    int j = 0;
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    //WRITE YOUR CODE HERE
    
    for (int i=1;i<=n;i++) { 
    	for(j=i; j<=i; j++) {
    		
    		System.out.print("*");
    	}
    }
    
  }
}
