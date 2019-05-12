package day22;

import java.util.Scanner;

public class MidWord {
  public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     String str = scan.next();
     
    	String newStr = "";
		int n1 = 0;
		int n2 = 0;
		int count = 0;

		for (int i = 0; i <= str.length() - 4; i++) {
			if (str.substring(i, i + 2).equals("dna")) {
count++;
			}

		}
		if (count <= 1) {
			System.out.println("nothing");
		} else if (count >= 2) {
			n1 = str.indexOf("dna");
			n2 = str.indexOf("dna", n1+4);
			newStr = (str.substring(n1 + 3, n2));

			System.out.println(newStr);
		}

	}
}
