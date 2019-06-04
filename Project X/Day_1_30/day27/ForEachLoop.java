package day27;

public class ForEachLoop {

	public static void main(String[] args) {
		
		int nums [] = {1,33,567,11, 22};
		
		for(int i=0; i<nums.length; i++) {
			
			int eachItem = nums[i];
			System.out.println(eachItem);
		}
		
		
		//for each loop syntax
		// for (  eachItem DataType    :  array variable or collection var        ){
		// your action here}
		
		// for each loop is only be used in loops of collection type
		
		for ( int eachItem : nums) {
			System.out.println(eachItem);
		}

	}

}
