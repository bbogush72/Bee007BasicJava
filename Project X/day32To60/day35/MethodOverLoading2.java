package day35;


public class MethodOverLoading2 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    /*
     * can i use same method name for different methods ? 
     * YES !!!!!! 
     * That's called method overloading 
     * 
     * Defination : 
     *    reusing the name of the method with different method parameters
     * 
     * */ 
    printName(); 
    printName("JAVA ");
    printName("JAVA ", "SnailMail");
    
    
  }
  
  public static void printName() {
    System.out.println(" Method overloading ");
  }
  
  public static void printName(String name) {
    System.out.println(" Method overloading " + name);
  }
   public static void printName(int number) {
	    System.out.println(" Method overloading " + number);
	  }
  
  
  
  public static void printName(String firstName, String lastName) {
    System.out.println(" Method overloading " + firstName+lastName);
  }
 
  
  

}
