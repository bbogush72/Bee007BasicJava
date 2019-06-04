package repl_20_40;

import java.util.*;

public class videoGameCoupons {
  public static void main(String[] args) {
    //Write your code here
    int candyBar =10;
    int gumBall=3;
    int numberOfCandyBars =0;
    int numberOfGumBalls =0;
    
    Scanner in = new Scanner(System.in);
    System.out.println("Enter number of coupons:");
    
    int coupon = in.nextInt();
    
    numberOfCandyBars = coupon/candyBar;
    numberOfGumBalls = (coupon%candyBar)/gumBall;
    
    System.out.println("Number of Candies: "+numberOfCandyBars);
    System.out.println("Number of Gumballs: "+numberOfGumBalls);
  }
}