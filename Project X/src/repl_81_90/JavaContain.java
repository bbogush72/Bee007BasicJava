import java.util.Scanner;

public class JavaContain {
	public static void main(String[] args) {
		boolean exists = false;
		Scanner scan = new Scanner(System.in);
		String word = scan.next();

		int counter = 0;
		int javaCount = 0;

		if (word.length() <= 1) {
			System.out.println("false");

			if (word.substring(counter, counter + 4).equals("java")) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}

		}
	}
}