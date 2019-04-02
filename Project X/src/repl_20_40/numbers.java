package repl_20_40;


import java.util.*;

public class numbers {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 2 numbers:");
    int TwoNums = input.nextInt();
    int TwoNums2 = input.nextInt();
    //CODE HERE 
    	
		if((TwoNums==TwoNums2)){
			
			System.out.println(TwoNums+ " and "+TwoNums2 +" are equal");
		}
		else if (TwoNums>TwoNums2) {
			System.out.println(TwoNums+ " is greater than " + TwoNums2);
		}
		
		else if(TwoNums2>TwoNums) {
			System.out.println(TwoNums2+ " is greater than "+TwoNums);
		}
	}

}

/*
 * Using Multi-Branch if statements, 
 * check if num1 and num2 are equal, or not. 
 * Please follow the below examples and print message accordingly:
 * Enter 2 numbers:
10
10
10 and 10 are equal

Enter 2 numbers:
100
55
100 is greater than 55

Enter 2 numbers:
33
333
333 is greater than 33
 
 */
    
  
