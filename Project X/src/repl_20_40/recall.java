package repl_20_40;
import java.util.Scanner;
public class recall {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		
		String result = year>=1995 && year<=1998 || year >= 1999 && year<=2006 ?
				"Bad shape, return to dealer" :"fine car";
		
		System.out.println(result);

	}

}




/*
System.out.println("Enter vehicle's year:");
		

		if ((year >= 1995 && year <= 1998) || (year >= 2001 && year <= 2002) || (year >= 2004 && year <= 2006)
				|| (year >= 2015 && year <= 2017)) {
			System.out.println("Your vehicle needs to be recalled!");
		} else {

			System.out.println("Your vehicle is fine, enjoy!");

*/