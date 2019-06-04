package day24;

public class Day24CountForwardBackward {

	public static void main(String[] args) {
		// count 1 to 20 and then on new line count 20 to 1
		
		for(int i=1; i<=20; i++) {
		System.out.print(i+ " ");
		}
		System.out.println();
		System.out.println();
		for(int i=20; i>0; i--)
			System.out.print(i+ " ");

	}

}
