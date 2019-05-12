package repl_91_110;

import java.util.Scanner;

public class ShoppingList {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
		String shoppingListReport = "";
		String list= "";
		String item = "";
		String item1 = "";
		String countinue = "";
		double price = 0;
		double price1 = 0;
		int count = 1;
		double totalPrice = 0;
		
		
		System.out.println("Enter Item1 and its price:");
		item1 = scan.next();
		price1 = scan.nextDouble();
		list = "Item1: "+item1+" Price: "+price1;
			
		do {
		  
			System.out.println("Add one more item?");
			countinue = scan.next();
			
			if(countinue.equalsIgnoreCase("yes")) {
			count++;
				System.out.println("Enter Item"+count+" and its price:");
				item = scan.next();
				price = scan.nextDouble();
				shoppingListReport= ", "+ "Item"+count +": "+item+" Price: "+ price;
				totalPrice=totalPrice+price1+price;
			}else {
				break;
			}
		}while(count<=10);
		System.out.println(list+shoppingListReport);
		System.out.println("Total price: "+totalPrice);
  }
}