package mentoringResources;

public class ReadValuesArrayForEach {

	public static void main(String[] args) {
		int [] nums [] = new int [3][2];
		
		nums [0][0] = 100; nums [0][1] = 200; 
		nums [1][0] = 300; nums [1][1] = 400; 
		nums [2][0] = 500; nums [2][1] = 600; 
		
		//for each loop to read values of the array
		// right side of semicolon where we put the array name
		for (int[] valuesGet   : nums) {
			int j =1;
			
			System.out.println();
			
			for (int numbers : valuesGet) {
				
				System.out.print("Array content: "+j++ +" : " +numbers +" ");
			}
			System.out.println();
		}
	}

}
