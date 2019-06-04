package day33;

public class SumMaxAll {

	  public static void main(String[] args) {
	    
	    int[] nums = new int[]{1,2,34,5,6} ; 

	    int sum = getSum(nums) ; 
	    System.out.println("sum of all numers: " + sum);
	    
	    // directly passing paramter value and directly printinh the 
	    // outcome without storing them  
	    //System.out.println( getSum( new int[] {1,3,4,5,1,1,1,1} ) );  
	    
	    int max = getMax(nums) ; 
	    System.out.println("max of all numers: " + max);
	    
	    
	    String[] names = {"Snail","Mail","Gone","To","Fishing"};
	    String concatResult = addAll(names) ; 
	    
	    System.out.println(concatResult);
	    
	    
	  }
	  
	  public static int getSum(int[] arr) {
	    
	    int sum=0;
	    for(int each: arr) {
	      sum+=each;
	    }
	    return sum;
	    
	  }
	  
	  public static int getMax(int[] nums) {
	        
	        int max = nums[0];
	        for (int i = 1; i < nums.length; i++) {
	            if (max < nums[i]) {
	                max = nums[i];
	            }
	        }
	        return max;
	    }

	  
	  public static String addAll(String[] strs) {
	        
	        String concatenation = "";
	        for (int i = 0; i < strs.length; i++) {
	            concatenation += strs[i];
	        }
	        return concatenation; 
	    }





	  /*
	   * Warmup 1.1
	   * 
	   * Create a static method getSum accept 1 parameter as int array 
	   * and return the sum of the all the items in array
	   * 
	   * another method called addAll accept 1 parameter as String array 
	   * and return the
	   * concatenation of all items
	   * 
	   * another method called getMax accept 1 parameter as int array 
	   * and return the
	   * max from the all the items in array
	   * 
	   * Optional : 
	   * create a method that take one String parameter as sentence 
	   * return first character for 
	   * first word and all characters of last word except first char
	   * example : Love Java --> Lava 
	   * 
	   */
	}
