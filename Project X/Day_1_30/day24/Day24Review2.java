package day24;

public class Day24Review2 {

	public static void main(String[] args) {


		for(int i=20; i>=0; i--) {
			for(int j=20; j>=i; j--) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}

	}

}
