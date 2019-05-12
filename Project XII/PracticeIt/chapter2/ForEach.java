package chapter2;

public class ForEach {

	public static void main(String[] args) {

		int []cols = {1,2,3};
		int []rows = {1,2,3,4};
		
		for(int row : rows) {
			System.out.println();
			for(int column: cols) {
				System.out.println("|Row "+ row+ "- Column "+ column);
			}
		}
	}

}
