package repl_40_60;

import java.util.*;

public class SchoolSystem {
  public static void main(String[] args) {
    //DO NOT CHANGE
    Scanner scan = new Scanner(System.in);
    //WRITE YOUR CODE HERE 
    
 System.out.println("Enter age:");
    int age = scan.nextInt();
    
    
    String eligible = null;
    
    switch(age) {
    case 1:  eligible = "ineligible";
    break;
    
    case 2: eligible = "toddler";
    break;
    
    case 3: 
    case 4:
    case 5:eligible = "early childhood";
    break;
    
    case 6:
    case 7: eligible = "young reader";
    break;
    
    case 8:
    case 9:
    case 10: eligible = "elementary";
    break; 
    
    case 11:
    case 12: eligible = "middle";
    break;
    
    case 13: eligible = "impossible";
    break;
    
    case 14:
    case 15:
    case 16: eligible = "high school";
    break;
    
    case 17:
    case 18: eligible = "scholar";
    
    default: eligible = "ineligible";
  
    
    }
    System.out.println(eligible);
   }
}
