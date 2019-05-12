package day27;

import java.util.Arrays;

public class ArrayEquality {

	public static void main(String[] args) {


		int [] arr1 = { 1, 3, 4, 65, 2};
		int [] arr2 = { 1, 3, 4, 65, 2};
		int[] arr3 = {3,1,4,65,2} ; 
		
		
		
		System.out.println(arr1[0]==arr2[0]); // true
		
		//boolean sameOrNot = Arrays.equals(arr1, arr2);
		//System.out.println(sameOrNot);
		
        System.out.println(Arrays.equals(arr1,arr2)); //true
        
        
        
        
        System.out.println("Arr2 compare to Arr3" +  Arrays.equals(arr2, arr3) );
        Arrays.sort(arr2);
        Arrays.sort(arr3);
        
        System.out.println("Arr2 compare to Arr3 -- after sorting  " 
            +  Arrays.equals(arr2, arr3) );
	}
	
	

}
