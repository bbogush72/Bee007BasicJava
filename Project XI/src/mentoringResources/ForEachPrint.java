package mentoringResources;

public class ForEachPrint {

	public static void main(String[] args) {
int [] numbers [] = new int [3] [2];
		
		numbers [0][0] = 100;   numbers [0][1] = 200;      //columns    0 and 1
		numbers [1][0] = 300;   numbers [1][1] = 400;
		numbers [2][0] = 500;   numbers [2][1] = 600;	
		
		
		// for each loop to read values in the array
		// right side of the semicolon array name
		//left side of the semicolon, create the data type same with array
		
		
		for ( int value[]  : numbers    ) {
			//int j=1;
			for(int nums : value) {
				
				//System.out.println("Array content: "+ j++ + " = "+ nums);
				System.out.println("Array content: "+ " = "+ nums);
			}
			System.out.println();
			
			
		}
	}

}
