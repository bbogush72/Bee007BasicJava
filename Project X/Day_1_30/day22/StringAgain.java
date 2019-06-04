package day22;


public class StringAgain {

  public static void main(String[] args) {
    
    // String review 
          //0123456789012345678901
    String str = "Java String is Awesome" ; 
    int count = str.length(); 
    int lastIndex =  count-1 ; 
    
    System.out.println("How many char : " +  count);
    System.out.println("last char index : " +  lastIndex);
    
    // getting the index of word String 
    
    int indexOfWordString = str.indexOf("String") ; 
    System.out.println( indexOfWordString );
    
    // what if we have more than one 
    int indexOfA = str.indexOf("A") ;
    // what if we have more than one --> FIRST OCCURANCE 
    System.out.println(indexOfA);
    
//          //0123456789012345678901
//    String str = "Java String is Awesome" ; 
//    
    String part = str.substring(12,14) ; 
    System.out.println(part);
    System.out.println(str.substring(1,6) ) ;
    
  
  }

}

