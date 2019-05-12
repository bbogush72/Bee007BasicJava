package repl_71_80;

import java.util.Scanner;

/*
 In this task, you need to swap first name with last name in the email. 
 If email doesn't contains underscore - do not anything. 

Example:
input: mike_tyson@gmail.com
output: tyson_mike@gmail.com

Example:
input: viktoryakubovich@gmail.com
output: viktoryakubovich@gmail.com
 
 */

public class email {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String email = scan.nextLine();

		int index = email.indexOf("_");
		int indexAt = email.indexOf("@");
		int indexDot = email.indexOf(".");

		if (email.contains("_")) {
			String last = email.substring(index + 1, indexAt);
			String first = email.substring(0, index);
			String rest = email.substring(indexAt, indexDot + 4);

			System.out.println(last + first + rest);
		} else if (!email.contains("_")) {
			System.out.println(email);
		}

	}

}
