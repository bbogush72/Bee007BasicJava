package day19;
import java.awt.image.RescaleOp; // don't know what this thing does here :)))
import java.util.Scanner;

public class While3 {
	public static void main(String[] args) {
		
	
	String word, reversed = "";
	Scanner scan = new Scanner(System.in);

	System.out.println("Palindrome tester: Type right in: ");
	word = scan.nextLine();
	
	int count=word.length()-1;
    
    while(count>=0) {
        reversed=reversed+word.charAt(count);
        count-- ;
        
    }
    System.out.println("Reverse of "+ word +" is "+ reversed);
    
    if(reversed.equals(word)){
    	System.out.println("palindrome");
    }else {
    	System.out.println("not palindrome");
    }
}
}