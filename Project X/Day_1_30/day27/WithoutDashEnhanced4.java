package day27;

public class WithoutDashEnhanced4 {

	public static void main(String[] args) {
		
		String word = "Life is full of things";
		
		String words [] = word.split(" ");
		
		char MyWords [] = { };
		String withDash = "";
		
		for(String some : words) {
			withDash="";
			MyWords = some.toCharArray();
			
			for(char myChar : MyWords)
				withDash = withDash + myChar+ " - ";
			
			
			System.out.println(withDash.substring(0, withDash.length()-2));
			System.out.println();
		}
		

	}

}
