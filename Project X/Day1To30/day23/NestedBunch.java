package day23;

public class NestedBunch {

  public static void main(String[] args) {

    // WARM UP TASKS
    /*
     * 2, print 1-5 in one line print above line 5 more times as we did in class NOW
     * : modify this code to print 
     * 1 
     * 12 
     * 123 
     * 1234 
     * 12345
     */
    
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
    
    

    
    
    
//    for (int j = 1; j <= 1; j++) {
//      System.out.print(j + " ");
//    }
//    System.out.println();
//    for (int j = 1; j <= 2; j++) {
//      System.out.print(j + " ");
//    }
//    System.out.println();
//    for (int j = 1; j <= 3; j++) {
//      System.out.print(j + " ");
//    }
//    System.out.println();
//    for (int j = 1; j <= 4; j++) {
//      System.out.print(j + " ");
//    }
//    System.out.println();
//    for (int j = 1; j <= 5; j++) {
//      System.out.print(j + " ");
//    }
//    System.out.println();
    
    
    
//    for (int i = 1; i <= 5; i++) {
//
//      for (int j = 1; j <= 5; j++) {
//        System.out.print(j + " ");
//      }
//      
//      System.out.println();
//    }
    
    char A = 'A';
    char Z = 'Z';
    
    while(Z>=A) {
    
    
    for(int i= 'Z'; i>='A'; i --) {
    	
    	for(int k = i; k>=i; k--) {
    		System.out.print((char)k+ " ");
    	}
    	
    }
    
    System.out.println();
    
    }
  }

}
