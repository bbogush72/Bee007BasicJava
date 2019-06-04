package day35;

public class Longest2 {

  public static String findLongestWord(String... words) {

    String longestWord = words[0];

    for (String name : words) {
      if (name.length() >= longestWord.length()) {
        longestWord = name;
      }
    }

    return longestWord;
  }

  public static void main(String[] args) {
    /*
     * // Warm up Create a static method called findLongestWord this method have one
     * parameter as String vararg and return the longest word as String
     */
    String[] names = { "abc", "c", "hyght" };
    
  
        
    
    System.out.println(  findLongestWord("Odiljan","Talmurat","Sulayman","Marat")   );
    System.out.println(  findLongestWord("Sumeyye","Hafsa","Emre", "Okan","Omer")   );

    
  }

}


//    for (int i = 0; i < names.length; i++) {
//      
//      if(names[i].length() > longestWord.length() ) {
//        
//        longestWord = names[i];
//        
//      }
//      
//    }

