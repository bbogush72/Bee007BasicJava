package day34;

public class SentenceBuilder {

  public static void main(String[] args) {
  
    String sentence = sentenceBuilder("Snail", "Pillbug", "Bird", "cat", "fish");
    String word = wordBuilder("Dragon", "Fly", "Dragonite", "Flyonite");
    
    System.out.println(sentence);
    System.out.println(word);

  }
  // Task 4
  // create a static method sentenceBuilder
  // take string vararg words as parameter
  // return the concatenation of all the arguments user passed
  // call this method to see your result
  public static String sentenceBuilder(String... words) {

    String sentence = "";
    for (String str : words)
      sentence += str + " ";
    return sentence;

  }

  // Task 5
  // create a static method wordBuilder
  // take string vararg words as parameter
  // return the concatenation of last character
  // from all the words user passed
  // call this method to see your result

  public static String wordBuilder(String... values) {
    
    String concatenation = "";
    for (String word : values) {
      concatenation +=  word.charAt(word.length() - 1);
    }
    return concatenation ; 
  }


}