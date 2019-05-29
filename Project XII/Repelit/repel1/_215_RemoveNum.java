package repel1;

import java.util.*;

public class _215_RemoveNum {
  public static ArrayList<Integer> removeInst(ArrayList<Integer> r,Integer n) 
  {
	  while(r.contains(n)){
	        r.remove(n);
	    }
	    return r;
   
   
  }
  
  public static void main(String[] args)
  {
  
    ArrayList<Integer>  arr = new ArrayList<>();
    Integer[] nums = new Integer[]{1,1,2,3};
    arr.addAll(Arrays.asList(nums));
    
    System.out.print(removeInst(arr,1));
   
  
  }//end main
}
