package day39;


import java.nio.file.*;
import java.util.*;

public class ListWithMethods {

  public static void main(String[] args) {

    List<String> lineLst = getTextFileAsList("notes.txt");
    //List<String> lineLst2 = getTextFileAsList("");
    System.out.println(lineLst.size()  );
    
    // xls  doc  ppt  pdf
    String s = "erat_quisque_erat.xls";
    // how do we just get file extention
    String fileExtention = s.substring(s.indexOf(".") + 1);
    System.out.println(fileExtention);
    
    //  pdfdocpptxls.pdf
    
    int count = 0 ; 
    for (String each : lineLst) {
      if(each.endsWith(".xls")) {
        count++ ; 
      }
        
    }
    System.out.println("excel file count is : " + count);
    
    // TASK 2 , find out the longest file Name
    String longest = lineLst.get(0); 
    
    for (String each : lineLst) {
      
      if(each.length() > longest.length()) {
        longest = each ; 
      }
      
    }
    System.out.println("Longest file name : "+  longest );
    
    // TASK 3 : FIND OUT LONGEST EXCEL FILE 
    String longestExcel = ""; //lineLst.get(0); 
    
    for (String each : lineLst) {
      
      if(each.endsWith(".xls") && (each.length() > longestExcel.length()) ) {
        longestExcel = each ; 
      }
      
    }
    System.out.println("Longest Excel file name : "+  longestExcel );
  }
    public static List<String> getTextFileAsList(String fullPath) {

        List<String> allLines = null;
        try {
          allLines = Files.readAllLines(Paths.get(fullPath));
        } catch (Exception e) {
          System.out.println("Wrong file path probably");
        }
        return allLines;

      }
    }