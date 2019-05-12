package repl_111_150;
import java.util.*;

public class Multiplication {
  public static void main(String[] args) {
    int [][] multiplicationTable = new int[10][10];
    
    //TODO: type your code below
    
    for (int i=0; i<=multiplicationTable.length-1; i++){
     for(int j=0; j <= multiplicationTable[i].length-1; j++){

       multiplicationTable[i][j]=(i+1)*(j+1);
       }

     }
    //Do not modify below line it will be used to test your code. And 
    //Can be used by you while developing your code
    System.out.print(Arrays.deepToString(multiplicationTable) ) ;
  }
}