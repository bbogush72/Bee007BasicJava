package mentoringResources;

public class ArrayLengthOfRowsAndColums {

	public static void main(String[] args) {
							 //3 rows// 2 columns
		int [] nums [] = new int [3][2];
		
		//see the columns that show 0 and 1 they are [2]
		// see the rows that show 0, 1 and 2 they are [3] 
		nums [0][0] = 100; nums [0][1] = 200; 
		nums [1][0] = 300; nums [1][1] = 400; 
		nums [2][0] = 100; nums [2][1] = 100; 
		
		//Find the lengths of rows
		int lengthRows = nums.length;
		
		// Find the length of colunms
		
		int lengthColumn = nums[0].length;
		
		//Let's print both row and column size
		System.out.println("The Number of Rows: "+ lengthRows);
		
		System.out.println("The Number of Columns: "+ lengthColumn);
		
		
		//we can also directly print the lengths of rows and columns
		System.out.println("The Numbers of Rows: "+ nums.length);
		System.out.println("The Numbers of Rows: "+ nums[0].length);
		
	}

}
