package day19;

public class IgnoreCaseVSContains {

	public static void main(String[] args) {


		String str = "While Loop";
		
		System.out.println(str.equalsIgnoreCase("while loop")); //true
		
		System.out.println(str.equalsIgnoreCase("while")); //false
		
		System.out.println(str.equalsIgnoreCase("While")); //true
		
		System.out.println(str.equalsIgnoreCase("while loop"));
		
		System.out.println(  str.contains("while") );
		  
		System.out.println(  str.toLowerCase().contains("while") );

	}

}
