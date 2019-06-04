package repl_91_110;

public class Snippet {
	public static void main(String[] args) {

		String text = "Life is life and life has life and life has no value and life can have values";
		int count = 0;

		for (int i = 0; i < text.length() - 4; i++) {
			if (text.substring(i, i + 4).equalsIgnoreCase("Life")) {
				count++;
			} else
				;
		}
		System.out.println("String contains " + count + " life words");
	}
}
