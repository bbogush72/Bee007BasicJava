package chapter2;

public class CompareValues {

	public static void main(String[] args) {
		int x = 0;
		while (x++ < 10) {
		}
		String message = x > 10 ? "Greater than" : "false";
		System.out.println(message + "," + x);
		
		
		short z=10;
		//int y = (int) (2*z);
		int y = (2*z);
		
	}
}