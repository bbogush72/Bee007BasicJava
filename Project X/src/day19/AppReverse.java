package day19;


public class AppReverse {

  public static void main(String[] args) {
    
    String app = "app" ; 
    String reversedApp = "";
    
//    reversedApp = reversedApp + app.charAt(2) ; 
//    System.out.println(reversedApp);
//    
//    reversedApp = reversedApp + app.charAt(1) ; 
//    System.out.println(reversedApp);
//    
//    reversedApp += app.charAt(0) ; 
//    System.out.println(reversedApp);
    
    int x = 2 ; 
    
    while(x>=0) {
    
    //  System.out.println( x );
      reversedApp = reversedApp + app.charAt(x) ; 
      System.out.println(reversedApp);
      
      x-- ; 
    
    }
    System.out.println("final value of reversed word is " + reversedApp);

    
    
    

  }

}

