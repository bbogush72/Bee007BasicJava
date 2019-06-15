package String2;

import java.util.Scanner;

public class StartOther {
	

	public boolean Salad(String a , String b) {
		
		String al = a.toLowerCase(), 
			   bl = b.toLowerCase();
		
		// if a1 starts with b1 ==> true if not ==> false
	// or  if b1 starts with a1 ==> true if not ==> false
		return (al.startsWith(bl) || bl.startsWith(al));
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 words to check if starts with same");
		String str= scan.next();
		String str2= scan.next();
		StartOther z = new StartOther();
		z.Salad("Hiabc", "abc");
		System.out.println(z.Salad(str, str2));
		scan.close();
	}
}

