package mentoringResources;

public class ArrayLengthsOfRowsColumn {

	public static void main(String[] args) {
		
		// create 2D array that 3 rows and 2 columns 
								// row//column
		int [] numbers [] = new int [3] [2];
		
		numbers [0][0] = 100;   numbers [0][1] = 100;      //columns    0 and 1
		numbers [1][0] = 100;   numbers [1][1] = 100;
		numbers [2][0] = 100;   numbers [2][1] = 100;		// rows     0 , 1 and 2
		
		// find the length of numbers in rows;
		int lengthOfNumbersRows = numbers.length;
		System.out.println("The length of numbers array is(rows): "+ lengthOfNumbersRows);
		
		//Directly assign length
		System.out.println("Row length: "+ numbers.length); // prints the length of numbers array
		
		// find the lenght of columns too
		
		int lengthOfNumbersColumns = numbers[0].length;
		System.out.println("The lenght of numbers in columns is: "+ lengthOfNumbersColumns);
		
		
		
		//directly print length of numbers
		System.out.println("The length of numbers in rows is: " + numbers.length );
	}

}
