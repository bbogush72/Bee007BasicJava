package day20;

public class Separator {

	public static void main(String[] args) {
		// Java20awesome ===> javaAwesome 20

		String mix = "Online132x";

		char c = mix.charAt(0);

		// check whether c is between 0-9

		if (c >= '0' && c < '9') {

			System.out.println("Number!");
		} else {
			System.out.println("Not a number");
		}
		
		if (c >= 'A' && c < 'Z') {

			System.out.println("UpperCase!");
		} else {
			System.out.println("Not uppercase");
		}

	}
}