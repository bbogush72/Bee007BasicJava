package day20;

public class Separator1Loop {

	public static void main(String[] args) {
		// Java20awesome ===> javaAwesome 20

		String mix = "Online132x";
		
		String numberStr ="";

		int i = 0;
		while (i < mix.length()) {
			char c = mix.charAt(i);

			if (c >= '0' && c < '9') {
				System.out.println(c);
				numberStr = numberStr +c;
			}

			i++;
		}
System.out.println(numberStr);
	}
}

