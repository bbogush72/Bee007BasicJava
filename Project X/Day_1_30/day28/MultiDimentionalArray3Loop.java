package day28;

public class MultiDimentionalArray3Loop {

	public static void main(String[] args) {
		
		int data2[][] = new int[2][2];
		data2[0] = new int[] { 1, 2 };
		data2[1] = new int[] { 2, 1 };

		for (int a = 0; a < 2; a++) {
			for (int b = 0; b < 2; b++) {
				System.out.println("Row:" + a + " Column:" + b + " = " + data2[a][b]);
			}

		}
	}

}
