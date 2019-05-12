package Chapter1;

public class NestedWhile {

	public static void main(String[] args) {

		int i=0;
		while(i<5) {
			i++;
			int j=0;
			while(j<3){
				j++;
				System.out.println("|Row "+i + " - Column "+j);
			}
			System.out.println();
		}
	}

}
