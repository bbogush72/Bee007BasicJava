package chapter2;

public class NestedFor {

	public static void main(String[] args) {

		for(int i =1; i<4; i++) {
			System.out.println();
			for(int j=0; j<3;j++) {
				System.out.println("|Row "+i+"- Column "+j);
			}
		}
	}

}
