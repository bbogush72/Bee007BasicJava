package OCA;

import java.util.Arrays;

public class MultiD {

	public static void main(String[] args) {
		int arr [] = {1,2};
		
		/*
		 * n dimensional array: contains n-1 dimensional arrays
		 * 
		 * 2D array: contains one dimensional array
		 * 
		 */
		
		int [] arr2D [] = {{1,2},  {3,4}                         };
				//index    	0		1
		//print [1][1]
		System.out.println(arr2D[1][1]);
		
		
		//print {3,4}
		System.out.println(Arrays.toString(arr2D[1]));
		
		//print{1,2}
		System.out.println(Arrays.toString(arr2D[0]));
		
		//entire rows and columns in multi dimensional array
		System.out.println(Arrays.deepToString(arr2D));
		
		
		//3D array: contains 2D arrays
			//index inside		 0		1	 ,    0			1	
		int [][][] numbers = { {{2,4}, {6,8}}, {{9, 44} , {64, 72} } };
						//index      0                      1
		
		//print all elements at once in 3D array
		System.out.println(Arrays.deepToString(numbers));
		
		//print the size of rows
		System.out.println("The length of columns in 3D array: "+ numbers.length);
		
		//print the columns
		System.out.println("The length of columns in 3D array: "+ numbers[0].length);
		
		
		//print {{2,4}, {6,8}};
		
		System.out.println(Arrays.deepToString(numbers[0]));
		
		int num6 = numbers[0][1][0]; // 6
		
		int num8 = numbers[0][1][1]; // 8
		
		int num9 = numbers [1][0][0]; // 9
		
		
		System.out.println(num6+" " + num8 + " "+ num9);
		
	}

}
