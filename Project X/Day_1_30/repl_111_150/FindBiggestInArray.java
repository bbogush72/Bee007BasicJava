package repl_111_150;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class FindBiggestInArray {

	public static void main(String[] args) {




    Scanner inp = new Scanner(System.in);
    int rows = inp.nextInt(), cols = inp.nextInt();
    int[][] arr = new int[rows][cols];
    for(int i=0 ;i<=rows-1;i++)
    {
      for(int j=0 ;j<=cols-1;j++)
      {
        arr[i][j]=inp.nextInt();
      }//end for cols
    }//end for rows
    
    
    //TODO write your code below
    
    int max = arr[0][0];
    for(int i=0; i<=arr.length-1; i++){
      for(int j=0;j<arr[0].length; j++){
        
        if(max<arr[i][j]){
          max=arr[i][j];
        }
      }
    }
    
    int [] nums = new int [Integer.MAX_VALUE-5];
    System.out.println(max);
   
  }//end main
}