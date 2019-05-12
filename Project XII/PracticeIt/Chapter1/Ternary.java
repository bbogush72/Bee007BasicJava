package Chapter1;

public class Ternary {

	public static void main(String[] args) {

		// composed of three parts; boolean ? expression1: expression 2

		/*
		 * if (n1>n2) { max =n1; } else{ max=n2; } we can write this in ternary way
		 */
		int n1 = 1;
		int n2 = 3;
		int max = (n1 > n2) ? n1 : n2;
		System.out.println(max);

		// if condition is true max = n1;
		// if condition is false max =n2;

		// =================String ternary
		String action = "";
		boolean isGreen = true;

		action = isGreen ? "can drive" : "cannot drive";
		System.out.println(action);

		// ternary int data type
		int bill = 2000;
		int discount = bill > 1999 ? 15 : 10;
		System.out.println(discount + " dollars");

		// nested ternary condition
		int qty = 12;
		discount = (bill > 2000) ? (qty > 11) ? 10 : 9 : 5;
		System.out.println(discount + " dollars now");

		// let's see nested if same way
		bill = 1400;
		qty = 10;
		if (bill > 100) {

			if (qty > 11) {
				discount = 10;

			} else {
				discount = 9;
			}

		} else {
			discount = 5;
		}
System.out.println(discount);
	}
}
