package day35;

public class ShortestForEach {

	public static String findShortest(String... words) {

		String shortest = words[0];

		for (String name : words) {
			if (name.length() <= shortest.length()) {
				shortest = name;
			}
		}

		return shortest;
	}

	public static void main(String[] args) {
		/*
		 * // Warm up Create a static method called findShortestWord this method have
		 * one parameter as String vararg and return the shortest word as String
		 */
		String[] names = { "flonotie", "chronotie", "crenopythe", "ccf" };

		System.out.println(findShortest("flonotie", "chronotie", "crenopythe", "ccf"));

	}

}
