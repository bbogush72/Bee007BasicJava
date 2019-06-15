package String2;

public class XyBalance2 {
	/*
	 * 
	 * We'll say that a String is xy-balanced if for all the 'x' chars in the
	 * string, there exists a 'y' char somewhere later in the string. So "xxy" is
	 * balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if
	 * the given string is xy-balanced.
	 * 
	 * 
	 * xyBalance("aaxbby") → true xyBalance("aaxbb") → false xyBalance("yaaxbb") →
	 * false
	 */
	public static void main(String[] args) {

	}

	public boolean xyBalance(String str) {
		int size = str.length() - 1;
		char ch;

		// classic for loop, going backwards, look for y first then x later
		// if y found first, means it's located closer to the end and after x, true
		// if x found first, means it's located closer to the end and after y, false
		for (int i = size; i >= 0; i--) {
			// assign char ch the i value for each iteration
			ch = str.charAt(i);

			// if ch equals y, that means it's located after x, so return true
			// if ch x prints first, meaning x is located after y so return false.
			if (ch == 'x')
				return false;
			else if (ch == 'y')
				return true;
		}

		return true;
	}

}
