package repl_91_110;

import java.util.Scanner;

public class shopping_List {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String shoppingListReport = "";
		String item = "";
		String countinue = "";
		double price = 0;
		int count = 1;
		double totalPrice = 0;
		String shoppingListReportLast = "";
		
		for (count = 1; count <= 10; count++) {
			System.out.println("Enter Item" + count + " and its price:");
			item = scan.next();
			price = scan.nextDouble();
			totalPrice += price;

			System.out.println("Add one more item?");
			countinue = scan.next();

			if (countinue.equalsIgnoreCase("no")) {
				break;
			}
			shoppingListReport = shoppingListReport + "Item" + count + ": " + item + " Price: " + price + ", ";

		}
		shoppingListReportLast = shoppingListReport + "Item" + count + ": " + item + " Price: " + price;

		System.out.println(shoppingListReportLast);
		System.out.println("Total price: " + totalPrice);

	}
}