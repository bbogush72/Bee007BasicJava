package day33;

import java.util.Arrays;

public class CombineArray {

	public static void main(String[] args) {
		double[] nums1 = new double[]{1,2,34,5,6} ; 
		double[] nums2 = new double[]{11,22,343,54,66} ; 
		
		double[] expected = new double[]{1.0, 2.0, 34.0, 5.0, 6.0, 1.0, 2.0, 34.0, 5.0, 6.0};  
		double[] nums3Check = combineNums(nums1,nums2); 
	    if(Arrays.equals(nums3Check,expected )) {
	      System.out.println("Test has passed ");
	    }else {
	      System.out.println("Test Failed");
	    }
 
		System.out.println(Arrays.toString(combineNums(nums1, nums2)));
	}
	

	

	public static double [] combineNums( double[] nums1, double[] nums2) {
	
		int size = nums1.length+ nums2.length;
		double [] combined = new double [size];
		
		for(int i=0; i<nums1.length; i++) {
			
			combined[i] = nums1[i];
		}
		
		for(int j=0; j<nums1.length; j++) {
			
			combined[nums1.length +j] = nums1[j];
		}
		
		
		
		
		return combined;
			
		
	}
	}
