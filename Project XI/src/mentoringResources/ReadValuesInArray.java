package mentoringResources;

public class ReadValuesInArray {

	public static void main(String[] args) {
		// two methods to see array content, classic loop and for each
		
		int [] nums [] = new int [3][2];
		
		//see the columns that show 0 and 1 they are [2]
		// see the rows that show 0, 1 and 2 they are [3] 
		nums [0][0] = 100; nums [0][1] = 200; 
		nums [1][0] = 300; nums [1][1] = 400; 
		nums [2][0] = 500; nums [2][1] = 600; 
		
		//classic for loop to see the content of array
		for(int i=0; i<nums.length; i++) { //outer loop
			for(int j=0; j<nums[i].length; j++) { // inner loop nums[0=i] because of the column length we measure
				System.out.print(nums[i][j] + " ");
			}
			
		}

	}

}
