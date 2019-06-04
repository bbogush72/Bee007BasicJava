package day30;

public class ReportName {
	
	public static void reverseString() {
		String reverseIt= "Akbar thank you. Please make next lesson a bit more simple and slow and reiterate please please";
		for (int i = reverseIt.length() - 1; i >= 0; i--) {
			System.out.print(reverseIt.charAt(i));

		}
	}

	public static void main(String[] args) {
		
		reportName("Snail", "Mail");
		reverseString();
	}
	
	

	public static void reportName(String First, String Last) {

		int firstlength = First.length();
		int lastlength = Last.length();
		System.out.println("First name length is: " + firstlength);
		System.out.println("Last name length is: " + lastlength);
		char initial = First.charAt(0);
		System.out.println(initial + ". " + Last);
	}

	
}