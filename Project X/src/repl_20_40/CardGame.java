package repl_20_60;

import java.util.*;
public class CardGame {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    
    int house = s.nextInt();
    int player = s.nextInt();
    
    //your code here

  if(player>house){
    System.out.println("bust");
  }
if(player<house){
  System.out.println("player loss");
  
}

if (player==house){
  System.out.println("its a tie");
}
  if(player>house){
    System.out.println("player wins");
    
  }

    
  }
}
