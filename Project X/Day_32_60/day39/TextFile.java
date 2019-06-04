package day39;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TextFile {

	public static void main(String[] args) {
		
		//if it is under project,the name of file will be enough for path
		List<String> lineLst = getTextFileAsList("notes.txt");
		System.out.println(lineLst.size());
		int pptCount=0;  int docCount=0; int xlsCount=0;  int pdfCount=0;  int otherCount=0;
		
		for (String list : lineLst) {
		  if(list.contains(".ppt")) pptCount++;
		  else if(list.contains(".doc")) docCount++;
		  else if(list.contains(".xls")) xlsCount++;
		  else if(list.contains(".pdf")) pdfCount++;
		  
		}
		System.out.println("ppt file count: "+pptCount);
		System.out.println("doc file count: "+docCount);
		System.out.println("xls file count: "+xlsCount);
		System.out.println("pdf file count: "+pdfCount);
		
		
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
