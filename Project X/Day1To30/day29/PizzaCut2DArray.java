package day29;

import java.util.Arrays;
import java.util.Scanner;

//public class Eraseable1 {
//  public static void main(String[] args) {
//    // Scanner input = new Scanner(System.in);
//      
//    int num=1;
//     for(int z=0; z<8;z++ ) {
//       
//       for(int j=7;j>0;j--) {
//         System.out.print(" ");
//         for(int i=1;i<8;i++) {
//           System.out.println(num);
//           num++;
//         }
//       }
//       
//     }[, , , ,  a, b ,  , aa]
//  }
//}


public class PizzaCut2DArray {
  public static void main(String[] args) {
  
    String [][] pizza ={
        {"mushroom","black olive","green pepper"},
                {"spinach","green pepper","mushroom"},
                {"black olive","black olive","spinach"},
                {"mushroom","mushroom","red pepper"},
                {"banana pepper","spinach","red pepper"},
                {"mushroom","green pepper","green pepper"},
                {"spinach","green pepper","mushroom"}
             
    };
    
    //System.out.println(Arrays.deepToString(pizza));
    
    for (int i=0; i<7;i++) {
      System.out.println("----------------"+(i+1)+". row -------------------");
      for(int j=0; j<3;j++) {
        System.out.print(pizza[i][j]+" | ");
      }
      System.out.println();
    }
    
    }
  }
  