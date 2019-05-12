package repl_91_110;

/*
 A sandwich is two pieces of bread with something in between. 
 Print the string that is between the first and last appearance of "bread" in the given string, 
 or return string "nothing" if there are not two pieces of bread.
Example:
input: breadjambread
output: jam

Example:
input: xxbreadjambreadyy
output: jam

Example:
input: xxbreadapple
output: nothing

Example:
input: breadbutterbread
output: butter
 */
import java.util.Scanner;

public class GetSandwich {
  public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     String str = scan.next();
     
    	String newStr = "";
		int n1 = 0;
		int n2 = 0;
		int count = 0;

		for (int i = 0; i <= str.length() - 5; i++) {
			if (str.substring(i, i + 5).equals("bread")) {
count++;
			}

		}
		if (count <= 1) {
			System.out.println("nothing");
		} else if (count >= 2) {
			n1 = str.indexOf("bread");
			n2 = str.indexOf("bread", n1+6);
			newStr = (str.substring(n1 + 5, n2));

			System.out.println(newStr);
		}

	}
}
/*
 * public class Example { public static void main(String[] args) { String s =
 * "Alex Vipul Verma"; for(int counter=0;counter<s.length();counter+=1) {
 * System.out.println(s.charAt(counter)); } } }
 */
