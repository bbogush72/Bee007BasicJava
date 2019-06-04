package day28;

import java.util.Arrays;

public class MultiDimArray {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    /*
     * 2 dimensional array can be visualized as excel sheet 
     *   which has rows and columns
     *  first dimension size of 2d array can be seen as row count 
     * second dimension size of 2d array can be seen as column count
     * 
     * 12 17 3 40 44 27 23 12
     */
    int[][] data = new int[4][2];
    data[0][0] = 12;
    data[0][1] = 17;
    data[1][0] = 3;
    data[1][1] = 40;
    data[2][0] = 44;
    data[2][1] = 27;
    data[3][0] = 23;
    data[3][1] = 12;

    int[][] data2 = new int[2][4];
    int[] data3[] = new int[3][2] ;  
    int data4[][] = new int[2][2] ; 
    
    
    int FinalData [] [] = data;
    int sum=0;
    
    //use for each to print and get sum
    
    for(int rows [] : FinalData) {
    	
    	for(int allRowsAndColumns : rows) {
    		sum+=allRowsAndColumns;
    	}
    	
    	System.out.println("Sum is: "+ sum);
    }
    
    
    
    for(int i=0; i<FinalData.length; i++) {
    	System.out.println(Arrays.toString(FinalData[i]));
    }
    
    	
  }

}