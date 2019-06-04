package day19;


import java.util.Scanner;

public class ReverseName {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String YourName = scan.next();
   
    
    int length = YourName.length();
    while(length>0) {
    	System.out.print(YourName.charAt((length-1))+"");
        length--;
    }
    
 
    
    
    
    
    //String reverse = (length<=8) ? YourName.charAt(8)+YourName.charAt(7)+YourName.charAt(6)+YourName.charAt(5)+YourName.charAt(4)+""+YourName.charAt(3)+""+YourName.charAt(2)+""+
    //								YourName.charAt(1)+""+YourName.charAt(0)+""+YourName.charAt(0): 
    //							  length >=8 ? "Too long!":   length<=8 ? "Too short!": "";
   						  
    	//						  System.out.println(reverse);
    
  }
}
