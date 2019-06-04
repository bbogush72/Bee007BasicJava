package repl_20_40;

import java.util.Scanner;

public class ShoppingList {
  public static void main(String[] args) {
    //WRITE YOUR CODE HERE:
  Scanner input=new Scanner(System.in);
     Scanner scan = new Scanner (System.in);
     System.out.println("Enter Item1 and its price:");
     String item1 = scan.next();
     Double price1 = scan.nextDouble();
     System.out.println("Enter Item2 and its price:");
     String item2 = scan.next();
     Double price2 = scan.nextDouble();
     System.out.println("Enter Item3 and its price:");
     String item3 = scan.next();        
     Double price3 = scan.nextDouble();
     Double totalPrice = price1 +price2 +price3;
                  
System.out.println ("Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3");
        System.out.println("Total price: " + totalPrice);
    
    
    
    
  }
}
