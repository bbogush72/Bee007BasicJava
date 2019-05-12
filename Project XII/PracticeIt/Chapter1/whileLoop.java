package Chapter1;

public class whileLoop {

	public static void main(String[] args) {

		int row =0;
		
		while (row<4) {
			row++;
			System.out.println();
			
			int col=0;
			
			while(col<3) {
				col++;
				System.out.println("|Row "+row + "- Column "+col);
			}
		}
	}

}
