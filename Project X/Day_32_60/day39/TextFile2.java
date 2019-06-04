package day39;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TextFile2 {

	public static void main(String[] args) {
		List<String> lineList = getTextFileAsList("notes.txt");
		// Size of lineList
		System.out.println(lineList.size());

		// xls doc ppt pdf
		String s = "name.xls";

		// find the location of the extension and print
		String fileExtension = s.substring(s.indexOf(".") + 1);
		System.out.println(fileExtension);

		// loop and find how many xls and other types
		int count = 0;
		for (String each : lineList) {
			if (each.endsWith(".xls")) {
				count++;
			}
		}

		// Task2 find the longest file name

		String longest = lineList.get(0);
		String longest2 = lineList.get(0);
		for (String each : lineList) {

			if (each.length() > longest.length() & each.endsWith(".xls")) {
				longest = each;
			}

			else if (each.length() > longest.length()) {
				longest2 = each;
			}
		}
		System.out.println("Longest file name: " + longest2);
		System.out.println("Longest xls file name: " + longest);
	}

	public static List<String> getTextFileAsList(String filePath) {
		List<String> allLines = null;
		try {
			allLines = Files.readAllLines(Paths.get(filePath));
		} catch (Exception e) {
			System.out.println("Wrong file path probably");
		}

		return allLines;
	}

}
