package repl_91_110;
import java.util.Scanner;
public class CountTriples {

	public static void main(String[] args) {
		

		  
		    Scanner scan = new Scanner(System.in);
		    String str = scan.next();
		    int count = 0 ;
		    //WRITE YOUR CODE HERE
		    
		  for(int i =0; i<str.length()-2; i++ ){
			  
			  char newChar = str.charAt(i);
		    
		    if(newChar== str.charAt(i+1)& newChar ==str.charAt(i+2)){
		    	count++;	 
		    	}
		    	
		    	
		    }
		    
		    System.out.println(count);
		    	
		    }
		 
		  }
		    

		  