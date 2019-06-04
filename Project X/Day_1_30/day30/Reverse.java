package day30;



public class Reverse {

  public static void main(String[] args) {
  
    reverseString("abc");  //-->> print out cba
    reverseString("Orville");  //-->> print out ellivrO
    reverseString("Java");  //-->> print out ellivrO
    reverseString("WestWorld");  //-->> print out dlroWtseW

  }
  
  public static void reverseString(String str) {
    
    for (int i = str.length() - 1; i >= 0; i--) {
      System.out.print(str.charAt(i));
    }
    System.out.println();
    
  }

}
