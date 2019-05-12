package chapter2;

public class NestedForAndWhileLoop {

	public static void main(String[] args) {

		for(int i =0; i<4; i++) {
			
			int j=0; 
			while(j<3) {
				System.out.println("|Row "+i+ "- Column "+ j );
				j++;
			}
			System.out.println();
		}
	}

}
