package day32;
import java.util.Scanner;
public class ReverseTrim {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String sentence = in.nextLine();
		
		String reversed="";
		//====================================
		
		String[] newSentence = sentence.split(" ");
		
		for(int i = newSentence.length-1; i>=0; i--       ) {
			reversed = reversed + newSentence[i]+ " ";
			
			
		}System.out.println(reversed);
		
	}

}
