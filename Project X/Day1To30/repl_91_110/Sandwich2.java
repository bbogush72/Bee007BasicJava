package repl_91_110;

import java.util.Random;

public class Sandwich2 {

	public static void main(String[] args) {
		

			String [] original = {"Hello", "How", "Are", "You"};

			jumble(original);

			}

			private static String[] jumble(String[] arr){

			Random r = new Random();

			for(int i = arr.length-1; i > 0; i--){

			int rand = r.nextInt(i);

			String temp = arr[i];

			arr[i] = arr[rand];

			arr[rand] = temp;

			}
			return arr;
	}

}
