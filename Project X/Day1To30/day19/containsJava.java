package day19;
import java.util.Scanner;
public class containsJava {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a sentence!");
		String word = input.nextLine();
		
		while(! word.toUpperCase(). contains("java")){
		
		//while((!word.contains("java") )) {
			
			 System.out.println("Enter a new sentence" );
			 word = input.nextLine();
			
			
		}
		
			System.out.println("You got it! It's Java alright!");

	}

}
