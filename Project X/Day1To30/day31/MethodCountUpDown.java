package day31;

public class MethodCountUpDown {
	public static void countFrom1To10() {
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");

		}
		System.out.println();
	}

	public static void countFrom10To0(int n) {

		for (int i = 10; i >0; i--) {
			System.out.print(i + " ");

		}
		System.out.println();
	}
	
	
	//======================Main Body below==============================

	public static void main(String[] args) {

		countFrom1To10();
		
		countFrom10To0( 0);
	}

}