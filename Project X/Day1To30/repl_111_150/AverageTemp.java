package repl_111_150;

import java.util.*;

public class AverageTemp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int k = 0;
		double total = 0;
		double avgTemp = 0;
		double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
				scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble() };

		/*
		 * Given an array temps of doubles, containing temperature data, compute the
		 * average temperature. Store the average in a variable called avgTemp. Besides
		 * temps and avgTemp, you may use only two other variables -- an int variable k
		 * and a double variable named total, which have been declared.
		 */
		for( double av: temps) {
			avgTemp= avgTemp+av;
			
		}
		System.out.println(avgTemp/8);
		
	}
}
