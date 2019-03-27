package repl_20_60;

import java.util.*;
public class BurgerChicken {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Burger or chicken if not, soda");
    String in = s.next();
    
    //your code here

	float a = (float) 10.0;
		float b = (float) 2.0;
		if (in.equalsIgnoreCase(("burger")) || in.equalsIgnoreCase("chicken")) {
			System.out.println(a);
		}

		if (in.equals("soda")) {
			System.out.println(b);
		}
	}
}



  

    
  
