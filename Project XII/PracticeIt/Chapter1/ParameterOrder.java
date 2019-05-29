package Chapter1;

public class ParameterOrder {
	public static void nPrint(String message, int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println(message);
		}
	}
	public static void main(String[] args) {
		nPrint("hello", 3);
	}
}
