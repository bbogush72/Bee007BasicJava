package Practice;

public class CharToArray1 {

	public static void main(String[] args) {
		// given a char array, convert it to a String then print

		char[] names = { '1', '2', '3', '4', '5' };

		String strNames = "";

		for (int i = 0; i < names.length; i++) {

			strNames = strNames + names[i]; // assign char items to a strNames

		}
		System.out.println("char names now assigned to strNames: " + strNames);

		String reverse = "";
//==========================================================================================reversed char names in string format
		for (int j = names.length - 1; j >= 0; j--) {

			reverse = reverse + names[j];

		}
		System.out.println("char names now reversed in String way: " +reverse);
	}

}
