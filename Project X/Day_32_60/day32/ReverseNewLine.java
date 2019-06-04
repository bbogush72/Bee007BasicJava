package day32;
import java.util.Scanner;
public class ReverseNewLine {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		String sentence = in.nextLine();
		
		//==================================
		
		String [] newSentence= sentence.split(" ");
		String reversed="";
		
		//==================================
		
		for (int i=newSentence.length-1; i>=0; i--            ) {
			reversed= reversed+ newSentence[i]+ "\n";
			
		}System.out.println(reversed);
	}

}
