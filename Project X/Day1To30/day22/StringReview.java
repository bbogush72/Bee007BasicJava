package day22;

import java.util.*;

public class StringReview {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int inhabitants = scan.nextInt();
    int k=0;
    int i;
    
    
    for(i= inhabitants; i>=0; i-- ) {
    	
    	if(i>=0) {
    	
    	i= i/2;
    	}
    	
    	System.out.println("Day "+k++ +" "+"["+ i+"]");
    }
    
  }
}



