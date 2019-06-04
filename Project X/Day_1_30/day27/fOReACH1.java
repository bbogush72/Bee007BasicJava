package day27;

public class fOReACH1 {

	public static void main(String[] args) {

		
		String word = "Break Time";
		char [] wordChars = word.toCharArray();
		String[] words =  word.split(" "); 
		
		 for(String eachWord : words) {
			
			 
		 
		
		for ( char c : wordChars)
			System.out.print(c + "-");

	}
		 System.out.println();

}
}