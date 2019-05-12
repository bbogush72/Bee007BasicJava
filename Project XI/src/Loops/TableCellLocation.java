package Loops;

public class TableCellLocation {

	public static void main(String[] args) {
		int [] numbers = new int[4];
		
		
		for (int row = 1; row <= 3; row++) {
			
			  System.out.println(" Row " + row+ " "+ numbers[row] );
			
			  
			
		
		for (int column = 0; column < 4; column++) {
			
			  System.out.print(" Cell(" + row+ "," +column+") ");
			
			  
			}

	}

}
}