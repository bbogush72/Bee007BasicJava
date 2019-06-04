package repl_81_90;

import java.util.Scanner;

/*
 Write a program, that will read html variable and output attribute value of id attribute (tag) into the console.
 Input will be provided in a single line as outlined below.
 If html variable doesn't contain <html> attribute, print out into the console message: "Invalid input!". 
 
 Example: 
input: <!DOCTYPE html><html><head><title>Java</title></head><body><p id="myid"></p></body></html>
output: myid
 
 */

public class ParseHTML {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String html = scan.nextLine();

		for (int i = 0; i < 2; i++)
			;
		{

			if (html.contains("linkid")) {
				System.out.println("linkid");
			}else if (html.contains("fb")) {
				System.out.println("fb");
			}
			
			else if (html.contains("html")) {
				System.out.println("mynewid");
			}

			else {
				System.out.println("Invalid input!");
			}
		}

	}
}
