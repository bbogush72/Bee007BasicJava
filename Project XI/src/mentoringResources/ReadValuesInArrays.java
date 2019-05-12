package mentoringResources;

public class ReadValuesInArrays {

	public static void main(String[] args) {
		
		int [] numbers [] = new int [3] [2];
		
		numbers [0][0] = 100;   numbers [0][1] = 200;      //columns    0 and 1
		numbers [1][0] = 300;   numbers [1][1] = 400;
		numbers [2][0] = 500;   numbers [2][1] = 600;		// rows     0 , 1 and 2
		
		//print values in the array
		
		for(int i=0; i<numbers.length; i++) { //outer loop 0 1 2 3(3 is not less than 3; stops)    100  200  300  400 500 600
			for(int j=0; j<numbers[i].length; j++) { //inner loop 0 1 2
				
				//j<numbers[i].length; measuring column length
				
				System.out.print(numbers[i][j]+ " ");
				
			}
		}
	}

}
