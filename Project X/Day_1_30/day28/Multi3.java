package day28;

public class Multi3 {

	public static void main(String[] args) {
		int [] [] data = { { 2,14,3}, 
						   { 4, 5 },
						   { 9, 7 }  };
		
		
		for (int[] allBoxes : data) {
				for(int total : allBoxes) {
					
					System.out.print(total + " ");
				}
				System.out.println();
		}
		
		
		
			for(int i=0; i<data.length; i++) {
				
				System.out.println("Row number " + (i+1) + " : ");
				
				
				for(int j =0; j<data[i].length; j++) {
					
					System.out.print(data[i][j] + " ");
				}
				
				System.out.println();
			}
			
		
		
		
		}

	}


