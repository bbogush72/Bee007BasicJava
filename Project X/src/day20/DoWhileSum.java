
package day20;

public class DoWhileSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		    
		    // break statement is used to break out of switch statement
		    // and loops 
		    
		    int sum = 0;
		    int x=1;
		    do {
		      
		      System.out.println( x++);
		     //x++ ;   // x = x+ 1 ;  
		      sum=sum+x;
		      
		      
		    } while (x<10);
		    
		    System.out.println("sum is:"+sum);
		    

		  }

		}