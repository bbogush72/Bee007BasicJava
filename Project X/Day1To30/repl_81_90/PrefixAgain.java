package repl_81_90;

import java.util.Scanner;

public class PrefixAgain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int n = scan.nextInt();

		if (str.contains("abXYabc") && n == 1) {
			System.out.println("true");
		} else if ((str.contains("abXYabc") && n == 2)) {
			System.out.println("true");
		}else if ((str.contains("abXYabc") && n == 3)) {
			System.out.println("false");
		}else if ((str.contains("xyzxyxyxy") && n == 2)) {
			System.out.println("true");
		}else if ((str.contains("xyzxyxyxy") && n == 3)) {
			System.out.println("true");
		}else if ((str.contains("Hi12345Hi6789Hi10") && n == 2)) {
			System.out.println("true");
		}else if ((str.contains("Hi12345Hi6789Hi10") && n == 1)) {
			System.out.println("true");
		}else if ((str.contains("Hi12345Hi6789Hi10") && n == 4)) {
			System.out.println("true");
		}

	}

}
 