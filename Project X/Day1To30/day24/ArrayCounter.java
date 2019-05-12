package day24;

import java.util.Arrays;

public class ArrayCounter {

  public static void main(String[] args) {
    
    // TASK i: 
    
    int[] nums = {1,55,7,898,9,55,123,567} ; 
    
    // print out the array to see what's inside
    System.out.println(Arrays.toString(nums));
    // find the count of numbers more than 100 ; 
    
    int count = 0 ; 
    for (int i = 0; i < nums.length; i++) {
      
      if(nums[i]> 100)
        count++ ; 
      
    }
    System.out.println(count);
    
    
    
    

  }

}
