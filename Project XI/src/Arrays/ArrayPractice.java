package Arrays;

import java.util.ArrayList;

public class ArrayPractice {

	public static void main(String[] args) {
		/**create a single dimensional array and use for each to print all values*/
		int num []= {1,2,4,5,};
		for(int each : num)
		{
			System.out.print(each+ " ");
		}
		System.out.println();
		
		
		/**create a 2 dimensional array and use for each to print all values*/
		int num1[][] = { { 6,7  }, { 8,9,0  } };
		
		//find the size of rows
		int sizeRows =num1.length;
		//find the size of columns
		int sizeColumns =  num1[0].length;
		
		//create a nested for loop and iterate all the contents
		for (int i = 0; i < num1.length; i++) //outer loop
		{											
			for (int j = 0; j < num1[i].length; j++)  //inner loop
			{
				System.out.print(num1[i][j]+ " ");
			}
		}
		
		System.out.println();//space 
		
		/** use for each loop to print all values stored in num1   */
		// first store all values in int row[] array, 
		//then print columns along with rows in the inner loop
		for(int row[]: num1)
		{
			for(int column: row)
			{
			System.out.print(column+ " ");	
			}
		}
			
	}

}
